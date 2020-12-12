package com.juankevintrujillo.save;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.val;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SaveInFile {

    private SaveInFile() {
        // private constructor to avoid Major Code Smell of SonarLint (java:S1118)
        throw new IllegalStateException("SaveInFile class");
    }

    public static void save(@NonNull String file, @NonNull String data) throws IOException {
        val fileInBytes = (data + "\n").getBytes();

        @Cleanup
        OutputStream outputStream = new FileOutputStream(file, true);
        outputStream.write(fileInBytes);
    }

}
