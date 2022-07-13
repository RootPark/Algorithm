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

        selectionSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<SIZE-1;i++){
            int min_index = i;

            for(int j=i+1; j<SIZE;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,min_index,i);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
