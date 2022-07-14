package com.company;


import java.util.Scanner;

public class Main {

    public static int SIZE = 10;
    public static int[] arr = new int[SIZE];
    public static int[] counting = new int[100];
    public static int[] result = new int[SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("100 이하의 자연수 입력");
        for (int i = 0; i < SIZE; i++) {
            arr[i] = scanner.nextInt();
        }

       countingSort(arr);

        for (int i = 0; i < SIZE; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void countingSort(int[] arr) {
        for (int i = 0; i < SIZE; i++) {
            counting[arr[i]]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }

        for(int i= arr.length-1;i>=0;i--){
            int value = arr[i];
            counting[value]--;
            result[counting[value]] = value;
        }
    }
}