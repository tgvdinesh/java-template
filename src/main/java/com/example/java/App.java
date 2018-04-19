package com.example.java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        switch (T) {
            case 3:
                System.out.println("Weird");
                break;
            case 24:
                System.out.println("Not Weird");
                break;
            default:
                System.out.println();
        }
    }
}
