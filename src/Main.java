package com.sofka;

import java.util.Scanner;

public class Main {

    private final static double PI = 3.14;
    private static int numero1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite su primer numero");
        numero1 = input.nextInt();
        System.out.println("resultado: " + (numero1 * PI) );

    }
}