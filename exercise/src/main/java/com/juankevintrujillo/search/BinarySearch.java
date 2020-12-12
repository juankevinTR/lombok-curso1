package com.juankevintrujillo.search;

import lombok.val;
import lombok.var;

public class BinarySearch {

    private BinarySearch() {
        // private constructor to avoid Major Code Smell of SonarLint (java:S1118)
        throw new IllegalStateException("BinarySearch class");
    }

    public static int search(int[] elementsList, int elementToSearch) {
        val notPresent = -1;
        var position = 0;
        var size = elementsList.length - 1;

        while (position <= size) {
            var currentPosition = position + ((size - position) / 2);

            // elementToSearch is on the middle, return
            if (elementsList[currentPosition] == elementToSearch) {
                return currentPosition;
            }

            // elementToSearch is greater then ignore left middle
            if (elementsList[currentPosition] < elementToSearch) {
                position = currentPosition + 1;
            }

            // elementToSearch is lower then ignore right middle
            if (elementsList[currentPosition] > elementToSearch) {
                size = currentPosition - 1;
            }
        }

        // elementToSearch is not in the list, then return notPresent value
        return notPresent;
    }

}
