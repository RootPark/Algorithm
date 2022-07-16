import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static int SIZE = 10;
    public static int[] arr = new int[SIZE];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            arr[i] = scanner.nextInt();
        }

        heapSort(arr);

        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = heap.poll();
        }
    }
}