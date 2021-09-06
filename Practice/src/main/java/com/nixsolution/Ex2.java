package com.nixsolution;

import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        String firstname = new String();
        String lastname = new String();
        if (args.length == 2) {
            firstname = args[0];
            lastname = args[1];
        }else{
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                firstname = reader.readLine();
                lastname = reader.readLine();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(firstname + "\n" + lastname);
    }

}
