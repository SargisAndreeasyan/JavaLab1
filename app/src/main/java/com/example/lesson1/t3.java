package com.example.lesson1;

import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);
        int size = 3;
        int[][] arr = new int[size][size];
        int[][] tmp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                arr[i][j] = cons.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                tmp[j][i] = arr[i][j];
        }
        arr = tmp;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
