package com.juankevintrujillo;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Lombok {

    public static void main(String[] args) {
        System.out.println("** Lombok **");
        System.out.println("Example 1: " + Lombok.example1());
        System.out.println("Example 2: ");
        Lombok.example2();
    }

    private static String example1() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        example.add("Bye bye");
        example.add("This is an example");
        example.add("¡Hola, mundo!");
        example.add("¡Adiós, adiós!");

        val random = new Random();
        val position = random.nextInt(example.size() - 1);
        return example.get(position);
    }

    private static void example2() {
        val map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "Five");

        for (val entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }
    }

}
