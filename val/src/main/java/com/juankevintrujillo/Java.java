package com.juankevintrujillo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Java {

    public static void main(String[] args) {
        System.out.println("** Java **");
        System.out.println("Example 1: " + Java.example1());
        System.out.println("Example 2: ");
        Java.example2();
    }

    private static String example1() {
        final ArrayList<String> example = new ArrayList<>();
        example.add("Hello, World!");
        example.add("Bye bye");
        example.add("This is an example");
        example.add("¡Hola, mundo!");
        example.add("¡Adiós, adiós!");

        final Random random = new Random();
        final int position = random.nextInt(example.size() - 1);
        return example.get(position);
    }

    private static void example2() {
        final HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "Five");

        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("\t%d: %s%n", entry.getKey(), entry.getValue());
        }
    }

}
