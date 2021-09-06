package com.company.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class PathAndFilesEx3 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
        String dialog = "Privat \n Privet\n Kak dela? \n Horosho \n Kak u tebya\n Horosho\n";
        Files.write(filePath,dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        list.forEach(e -> System.out.println(e));
    }
}
