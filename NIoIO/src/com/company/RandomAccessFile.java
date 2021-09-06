package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) {
        try(java.io.RandomAccessFile file =
                new java.io.RandomAccessFile("test10.txt","rw")){

            int a = file.read();
            System.out.println((char) a);

            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
