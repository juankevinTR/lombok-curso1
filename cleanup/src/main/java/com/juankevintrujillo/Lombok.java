package com.juankevintrujillo;

import lombok.Cleanup;

import java.io.*;

public class Lombok {

    public static void main(String[] args) throws IOException {
        System.out.println("** Lombok **");
        final String path = "cleanup/src/main/resources/";
        Lombok.copyFile(path.concat("input.txt"), path.concat("output.txt"));
    }

    private static void copyFile(String input, String output) throws IOException {
        @Cleanup
        InputStream inputStream = new FileInputStream(input);
        @Cleanup
        OutputStream outputStream = new FileOutputStream(output);

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
