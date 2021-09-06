package com.company;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyEx2 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream(
                "C:\\Users\\Влад\\Desktop\\picture.jpg");
            FileOutputStream outputStream = new FileOutputStream(
                    "auf.jpg");
            ) {
                int i;
                while((i=inputStream.read())!=-1){
                    outputStream.write(i);
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
