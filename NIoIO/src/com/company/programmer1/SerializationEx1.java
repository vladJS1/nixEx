package com.company.programmer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Zaur");
        employees.add("Ivan");
        employees.add("Elena");
        employees.add("Igor");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin")
        )) {
            outputStream.writeObject(employees);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
