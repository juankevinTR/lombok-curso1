package com.juankevintrujillo;

import lombok.var;

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
        var example = new ArrayList<>();
        example.add("Hello, World!");
        example.add("Bye bye");
        example.add("This is an example");

        var random = new Random();
        var position = random.nextInt(example.size() - 1);
        var result = example.get(position);

        example = new ArrayList<>();
        example.add("¡Hola, mundo!");
        example.add("¡Adiós, adiós!");
        example.add("¡Esto es un ejemplo!");

        position = random.nextInt(example.size() - 1);
        result = result + "  ||  " + example.get(position);

        return result.toString();
    }

    private static void example2() {
        var map = new HashMap<>();
        map.put(0, "Zero");
        map.put(5, "Five");

        for (var entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }

        map = new HashMap<>();
        map.put(1, "One");
        map.put(6, "Six");

        for (var entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + ": " + entry.getValue());
        }
    }

}
