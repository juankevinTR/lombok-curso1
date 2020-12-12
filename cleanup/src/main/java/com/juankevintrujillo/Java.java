package com.juankevintrujillo;

import java.io.*;

public class Java {

    public static void main(String[] args) throws IOException {
        System.out.println("** Java **");
        final String path = "cleanup/src/main/resources/";
        Java.copyFile(path.concat("input.txt"), path.concat("output.txt"));
    }

    private static void copyFile(String input, String output) throws IOException {
        try (InputStream inputStream = new FileInputStream(input)) {
            try (OutputStream outputStream = new FileOutputStream(output)) {
                byte[] bufferBytesRead = new byte[10000];

                while (true) {
                    int totalBytesRead = inputStream.read(bufferBytesRead);
                    if (totalBytesRead == -1) {
                        break;
                    }
                    outputStream.write(bufferBytesRead, 0, totalBytesRead);
                }
            }
        }
    }

}
