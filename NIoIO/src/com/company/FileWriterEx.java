package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx  {
    public static void main(String[] args) throws IOException {
        String rubai = " Много лет размышлял я над жизнью земной\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n ";
        String s = "Привет";
        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt",true);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("GunDone!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
