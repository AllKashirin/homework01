package ru.netology.kashirin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name, please");
        String name = scanner.next();
        System.out.println("Имя студента = " + name);
    }
}