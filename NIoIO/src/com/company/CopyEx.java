package com.company;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("test3.txt"));
            ){
//            int character;
//            while((character=reader.read())!=-1){
//                writer.write(character);
//                System.out.println("DOne");
//            }
            String line;
            while((line=reader.readLine())!=null){
                writer.write(line);
                System.out.println("Done");
                writer.write('\n');
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
