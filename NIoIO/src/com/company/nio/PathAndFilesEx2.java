package com.company.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("test15.txt");
        Path directoryPath  = Paths.get("C:\\Users\\Влад\\Desktop\\A");

//        Files.copy(filePath,directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath,directoryPath.resolve("test16.txt"),StandardCopyOption.REPLACE_EXISTING);

//        Files.move(filePath,directoryPath.resolve("testik.txt"));

//        Files.move(Paths.get("test10.txt"),Paths.get("test11.txt"));

        Files.delete(Paths.get("test5.txt"));
    }
}
