package com.example;

import java.util.Random;

public class MathHomework {

    public static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt(10);
    }
}