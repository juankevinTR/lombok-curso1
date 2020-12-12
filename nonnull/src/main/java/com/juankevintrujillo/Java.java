package com.juankevintrujillo;

public class Java {

    private static float age = 0;

    public static void main(String[] args) {
        System.out.println("** Java **");
        System.out.println("Age: " + Java.age);
        try {
            Java.setAge(null);
        } catch (Exception e) {
            System.out.println("There was an exception setting the age");
        }
        Java.setAge(28F);
        System.out.println("Age: " + Java.age);
    }

    private static void setAge(Float value) {
        if (value == null) {
            throw new NullPointerException("The age is market @NonNull but is null");
        }
        Java.age = value;
    }

}
