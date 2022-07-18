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

        quickSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr){
        l_pivot_sort(arr,0,SIZE-1);
    }

    public static void l_pivot_sort(int[] arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int pivot = partition(arr,lo,hi);
        l_pivot_sort(arr,lo,pivot-1);
        l_pivot_sort(arr,pivot+1,hi);
    }

    public static int partition(int[] arr, int left, int right){
        int lo =left;
        int hi = right;
        int pivot = arr[left];

        while(lo<hi){
            while(arr[hi]>pivot && lo<hi){
                hi--;
            }

            while(arr[lo] <= pivot && lo<hi){
                lo++;
            }
            swap(arr,lo,hi);
        }

        swap(arr,left,lo);
        return lo;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
