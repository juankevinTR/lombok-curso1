package com.juankevintrujillo;

import com.juankevintrujillo.save.SaveInFile;
import com.juankevintrujillo.search.BinarySearch;
import lombok.val;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        // Variables
        val numbers = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72};
        val elementToSearch = 16;

        // Search
        val result = BinarySearch.search(numbers, elementToSearch);

        // Save in file or not
        String file = "exercise/src/main/resources/result.txt";

        if (result != -1) {
            String data = new Date() + " ==> "
                    + "The element '" + elementToSearch
                    + "' is present in " + Arrays.toString(numbers)
                    + " at index: " + result;
            SaveInFile.save(file, data);
        } else {
            System.out.println(new Date() + " ==> "
                    + "The element '" + elementToSearch
                    + "' is not present in " + Arrays.toString(numbers));
        }
    }

}
