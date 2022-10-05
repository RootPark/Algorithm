package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*100);
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        while(true) {
            System.out.print("검색할 값 : ");
            int search = scanner.nextInt();
            linearSearch(arr, search);
        }

    }

    public static void linearSearch(int[] arr, int search){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                count++;
                System.out.println("데이터가 "+i+"번 째에 있습니다.");
            }
        }
        System.out.println("데이터는 총"+count+"개 있습니다.");
    }

}
