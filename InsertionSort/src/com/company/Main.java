package com.company;


import java.util.Scanner;

public class Main {

    public static int SIZE = 10;
    public static int[] arr = new int[SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<SIZE;i++){
            arr[i] = scanner.nextInt();
        }

        insertionSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<SIZE;i++){
            int target = arr[i];

            int j = i-1;

            while(j>=0&&target<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }
    }
}
