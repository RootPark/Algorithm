package com.company;

import java.util.Scanner;

public class ArrayQueue implements Queue{

    private int front;
    private int rear;

    private int queueSize;
    private char queueArr[];

    public ArrayQueue(int queueSize){
        front = -1;
        rear = -1;
        this.queueSize = queueSize;
        queueArr = new char[this.queueSize];
    }

    public boolean isEmpty(){
        if(front==rear){
            front=-1;
            rear=-1;
        }
        return (front==rear);
    }

    public boolean isFull(){
        return (rear==this.queueSize-1);
    }

    public void enqueue(char item){
        if(isFull()){
            System.out.println("큐가 가득 차 있습니다!");
        }
        else{
            queueArr[++rear]=item;
            System.out.println("아이템 "+item+" 을 입력했습니다.");
        }
    }

    public char dequeue(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다! 지울 수 없습니다.");
            return 0;
        }
        else{
            System.out.println("아이템 "+queueArr[front+1]+" 을 지웠습니다.");
            front = (front+1)%this.queueSize;
            return queueArr[front];
        }
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다! 첫번째 값을 구할 수 없습니다.");
            return 0;
        }
        else{
            System.out.println("아이템 "+queueArr[front+1]+" 이 첫번째 값입니다.");
            return queueArr[front+1];
        }
    }

    public void clear(){
        if(isEmpty()){
            System.out.println("큐가 이미 비어있습니다!");
        }
        else{
            front = -1;
            rear = -1;
            queueArr = new char[this.queueSize];
            System.out.println("큐를 비웠습니다!");
        }
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("큐가 비어있습니다!");
        }
        else{
            System.out.println("-----------------");
            System.out.print("큐의 값 : ");
            for(int i=front+1;i<=rear;i++){
                System.out.print(queueArr[i]+" ");
            }
            System.out.println();
            System.out.println("-----------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("큐의 사이즈를 입력하세요 : ");
        int queueSize = scanner.nextInt();
        ArrayQueue arrayQueue = new ArrayQueue(queueSize);

        while(true){
            System.out.println("어떤 작업을 희망하십니까?\n1.입력 2.삭제 3.피크값 도출 4.전체삭제 5.출력");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.print("입력할 값은?: ");
                    char input = scanner.next().charAt(0);
                    arrayQueue.enqueue(input);
                    break;
                case 2:
                    arrayQueue.dequeue();
                    System.out.println("삭제완료");
                    break;
                case 3:
                    arrayQueue.peek();
                    break;
                case 4:
                    arrayQueue.clear();
                    break;
                case 5:
                    arrayQueue.printQueue();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
