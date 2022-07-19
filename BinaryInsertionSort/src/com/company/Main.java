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

        binaryInsertionSort(arr);

        for(int i=0;i<SIZE;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void binaryInsertionSort(int[] arr){
        if(SIZE<2){
            return;
        }

        int incLength = getAscending(arr,0,arr.length);
        binaryInsertionSort(arr,0,arr.length,incLength);
    }

    public static void binaryInsertionSort(int[] arr, int lo, int hi, int start){
        if(lo == start){
            start++;
        }

        for(;start<hi;start++){
            int target = arr[start];

            int loc = binarySearch(arr,target,lo,start);
            int j = start - 1;

            while (j>= loc){
                arr[j+1] = arr[j];
                j--;
            }

            arr[loc] = target;
        }
    }

    public static int binarySearch(int[] arr, int key, int lo, int hi){
        int mid;
        while(lo<hi){
            mid = lo + ((hi-lo)/2);

            if(key<arr[mid]){
                hi = mid;
            }
            else{
                lo = mid + 1;
            }

        }
        return lo;
    }

    public static int getAscending(int[] arr, int lo, int hi){
        int limit = lo + 1;
        if(limit == hi){
            return 1;
        }

        if(arr[lo] <= arr[limit]){
            while(limit<hi && arr[limit-1] <= arr[limit]){
                limit++;
            }
        }
        else{
            while(limit<hi && arr[limit-1]>arr[limit]){
                limit++;
            }
            reversing(arr,lo,limit);
        }
        return limit-lo;
    }

    public static void reversing(int[] arr, int lo, int hi){
        hi--;
        while(lo<hi){
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }

}
