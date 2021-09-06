package com.company.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath  = Paths.get("C:\\Users\\Влад\\Desktop\\A");

        System.out.println("filePath.getFileName() = "
                + filePath.getFileName());
        System.out.println("directoryPath.getFileName() = "
                + directoryPath.getFileName());

        System.out.println("<-------------------------------------------------->");

        System.out.println("filePath.getParent() = "
                + filePath.getParent());
        System.out.println("directoryPath.getParent() = "
                + directoryPath.getParent());

        System.out.println("<-------------------------------------------------->");

        System.out.println("filePath.getRoot() = "
                + filePath.getRoot());
        System.out.println("directoryPath.getRoot() = "
                + directoryPath.getRoot());

        System.out.println("filePath.toAbsolute() = "
                + filePath.toAbsolutePath());


        Path anotherPath = Paths.get("C:\\Users\\Влад\\Desktop");
        System.out.println("filePath.getparent() = "
                + filePath.toAbsolutePath().getParent());

        System.out.println("directoryPath.resolve(filePath) = " + directoryPath.resolve(filePath));

        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        if(!Files.exists(directoryPath)){
            Files.createDirectory(directoryPath);
        }


        System.out.println(Files.getAttribute(filePath,"creationTime"));

        Map<String,Object> attributes = Files.readAttributes(filePath,"*");
        for(Map.Entry<String,Object> entry : attributes.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
