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

        bubbleSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=SIZE-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
