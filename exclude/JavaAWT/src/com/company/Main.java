package com.company;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {

    public static void main(String[] args) {
	new Main();
    }
    Main(){
        super("Anisotropic mapping mode");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(400,300);
        add("Center",new CvAnisotr());
        setCursor(Cursor.getPredefinedCursor(
                Cursor.CROSSHAIR_CURSOR));
        setVisible(true);
    }
}

class CvAnisotr extends Canvas{
    int maxX, maxY;
    float pixelWidth,pixelHeight,rWidth=10.0F,rHeight = 7.5F,
        xP = -1, yP;
    CvAnisotr(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xP = fx(e.getX());
                yP = fy(e.getY());
                repaint();
            }
        });
    }

    void initgr(){
        Dimension d = getSize();
        maxX = d.width-1;
        maxY = d.height -1;

        pixelWidth = rWidth/maxX;
        pixelHeight = rHeight/maxY;
    }
    int iX(float x) {
        return Math.round(x/pixelWidth);
    }
    int iY(float y){
        return maxY - Math.round(y/pixelHeight);
    }

    float fx(int x){
        return x*pixelWidth;
    }
    float fy(int y){
        return (maxY - y)*pixelHeight;
    }

    public void paint(Graphics g){
        initgr();
        int left = iX(0),right = iX(rWidth),
                bottom = iY(0), top = iY(rHeight);

        if(xP >=0)
            g.drawString(
                    "Logical coordinates of selected point: "+
                            xP+ " " + yP,20,100
            );
        g.setColor(Color.red);
        g.drawLine(left,bottom,right,bottom);
        g.drawLine(right,bottom,right,top);
        g.drawLine(right,top,left,top);
        g.drawLine(left,top,left,bottom);
    }
}
