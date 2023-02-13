package com.example.lesson1;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();

        System.out.println("Enter number:");
        int b = sc.nextInt();

        System.out.println("Enter number:");
        int c = sc.nextInt();

        System.out.println("Enter number:");
        int d = sc.nextInt();

        if (a==b & b==c & c==d){
            System.out.println("Is equal");
        }
        else {
            System.out.println("Not equal");
        }

    }
}
