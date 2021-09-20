package com.company;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random number = new Random();
        int x = number.nextInt(6) + 1;
        System.out.println("You have rolled a: " + x);
    }
}

