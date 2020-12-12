package com.juankevintrujillo;

import lombok.NonNull;

public class Lombok {

    private static float age = 0;

    public static void main(String[] args) {
        System.out.println("** Lombok **");
        System.out.println("Age: " + Lombok.age);
        try {
            Lombok.setAge(null);
        } catch (Exception e) {
            System.out.println("There was an exception setting the age");
        }
        Lombok.setAge(28F);
        System.out.println("Age: " + Lombok.age);

        // Force Lombok exception error
        Lombok.setAge(null);
    }

    private static void setAge(@NonNull Float value) {
        Lombok.age = value;
    }

}
