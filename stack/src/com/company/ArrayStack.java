package com.company;

import java.util.Scanner;

public class ArrayStack implements Stack{

    private int top;
    private int stackSize;
    private char stackArr[];

    public ArrayStack(int stackSize){
        top=-1;
        this.stackSize=stackSize;
        stackArr = new char[this.stackSize];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull() {
        return (top==this.stackSize-1);
    }


    public void push(char item){
        if(isFull()){
            System.out.println("스택은 가득 차 있습니다! 더 넣을 수 없습니다.");
        }
        else{
            stackArr[++top]=item;
            System.out.println("아이템 "+item+" 을 넣었습니다.");
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("스택은 비어있습니다! 삭제할 수 없습니다.");
            return 0;
        }
        else{
            System.out.println("아이템 "+stackArr[top]+" 을 삭제했습니다.");
            return stackArr[top--];
        }
    }

    public char peek(){
        if(isEmpty()){
            System.out.println("스택은 비어있습니다! 상위값을 찾을 수 없습니다.");
            return 0;
        }
        else{
            System.out.println("상위값은 "+stackArr[top]+" 입니다.");
            return stackArr[top];
        }
    }

    public void clear(){
        if(isEmpty()){
            System.out.println("스택은 이미 비워져 있습니다!");
        }
        else{
            top=-1;
            stackArr = new char[this.stackSize];
            System.out.println("스택을 비웠습니다!");
        }
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("스택은 비어있습니다! 출력할 수 없습니다.");
        }
        else{
            System.out.print("저장된 스택 값 : ");
            for(int i=0;i<=top;i++){
                System.out.print(stackArr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("스택 사이즈를 입력하시오 : ");
        int stackSize = scanner.nextInt();
        ArrayStack arrayStack = new ArrayStack(stackSize);

        arrayStack.printStack();

        arrayStack.push('A');
        arrayStack.printStack();

        arrayStack.push('C');
        arrayStack.printStack();

        arrayStack.push('F');
        arrayStack.printStack();

        arrayStack.pop();
        arrayStack.printStack();

        arrayStack.peek();
        arrayStack.printStack();

        arrayStack.clear();
        arrayStack.printStack();
    }
}
