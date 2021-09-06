package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File directory = new File("C:\\Users\\Влад\\Desktop\\A");
        File file2 = new File("C:\\Users\\Влад\\Desktop\\A\\test20.txt");
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("directory.getAbsolutePath() = " + directory.getAbsolutePath());
        System.out.println("---------------------------------------------");
        System.out.println("file.isAbsolute() = "+ file.isAbsolute());
        System.out.println("directory.isAbsolute() = " + directory.isAbsolute());

        System.out.println("---------------------------------------------");
        System.out.println("file.isDirectory() = "+ file.isDirectory());
        System.out.println("directory.isDirectory() = " + directory.isDirectory());
        System.out.println("---------------------------------------------");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file2.exists() = " + file2.exists());
        System.out.println("---------------------------------------------");
        System.out.println(file2.createNewFile());
        System.out.println(directory.mkdir());
        System.out.println(file.createNewFile());
        System.out.println("---------------------------------------------");

        File[] files = directory.listFiles();
        System.out.println(Arrays.toString(files));

        System.out.println("file2.isHidden()" + file2.isHidden());
        System.out.println("file2.canRead()" + file2.canRead());
        System.out.println("file2.canWrite()" + file2.canWrite());
        System.out.println("file2.canExecute()" + file2.canExecute());

    }
}
