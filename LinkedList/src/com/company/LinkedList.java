package com.company;

import java.util.Scanner;

class ListNode{
    private String data;
    public ListNode link;

    public ListNode(){
        this.data = null;
        this.link = null;
    }

    public ListNode(String data){
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link){
        this.data = data;
        this.link = link;
    }

    public String getData(){
        return this.data;
    }
}
public class LinkedList {

    private ListNode head;

    public LinkedList(){
        head=null;
    }

    public void insertNode(ListNode preNode,String data){
        ListNode newNode = new ListNode(data,preNode);

        newNode.link=preNode.link;

        preNode.link=newNode;
    }

    public void insertNode(String data){
        ListNode newNode = new ListNode(data);
        if(head==null){
            this.head=newNode;
        }
        else{
            ListNode tempNode=head;

            while(tempNode.link!=null){
                tempNode=tempNode.link;
            }
            tempNode.link=newNode;
        }
    }

    public void deleteNode(String data){
        ListNode preNode = head;
        ListNode tempNode = head.link;

        if(data.equals(preNode.getData())){
            head = preNode.link;
            preNode.link = null;
        }
        else{
            while(tempNode!=null){
                if(data.equals(tempNode.getData())){
                    if(tempNode.link==null){
                        preNode.link=null;
                    }
                    else{
                        preNode.link=tempNode.link;
                        tempNode.link=null;
                    }
                    break;
                }
                else{
                    preNode=tempNode;
                    tempNode=tempNode.link;
                }
            }
        }
    }

    public void deleteNode(){
        ListNode preNode;
        ListNode tempNode;

        if(head==null){
            return;
        }

        if(head.link==null){
            head=null;
        }
        else{
            preNode=head;
            tempNode=head.link;
            while(tempNode.link!=null){
                preNode=tempNode;
                tempNode=tempNode.link;
            }
            preNode.link=null;
        }
    }

    public ListNode searchNode(String data){

        ListNode tempNode = this.head;
        while(tempNode!=null){
            if(data.equals(tempNode.getData())){
                return tempNode;
            }
            else{
                tempNode=tempNode.link;
            }
        }
        return tempNode;
    }

    public void reverseList(){
        ListNode nextNode = head;
        ListNode currentNode = null;
        ListNode preNode = null;

        while(nextNode!=null){
            preNode=currentNode;
            currentNode=nextNode;
            nextNode=nextNode.link;
            currentNode.link=preNode;
        }
        head = currentNode;

    }
    public void printList(){
        ListNode tempNode = this.head;

        System.out.println("-----------------------");
        while(tempNode!=null){
            System.out.print(tempNode.getData()+" ");
            tempNode=tempNode.link;
        }
        System.out.println();
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        while(true){
            System.out.println("1.삽입 2.삭제 3.역순");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("1.마지막에 삽입 2.중간에 삽입");
                    int inputMenu = scanner.nextInt();
                    scanner.nextLine();
                    switch (inputMenu){
                        case 1:
                            System.out.print("삽입할 데아터 : ");
                            String data1 = scanner.nextLine();
                            linkedList.insertNode(data1);
                            break;
                        case 2:
                            System.out.print("삽입할 데이터 : ");
                            String data2 = scanner.nextLine();
                            System.out.print("전 노드 : ");
                            String preNode = scanner.nextLine();
                            linkedList.insertNode(linkedList.searchNode(preNode),data2);
                            break;
                        default:
                            System.out.println("입력이 잘못되었음.");
                    }
                    linkedList.printList();
                    break;
                case 2:
                    System.out.println("1.마지막 삭제 2.중간에 삭제");
                    int deleteMenu = scanner.nextInt();
                    scanner.nextLine();
                    switch (deleteMenu){
                        case 1:
                            linkedList.deleteNode();
                            break;
                        case 2:
                            System.out.print("삭제할 데이터 : ");
                            String data = scanner.nextLine();
                            linkedList.deleteNode(data);
                            break;
                        default:
                            System.out.println("입력이 잘못되었음.");
                    }
                    linkedList.printList();
                    break;
                case 3:
                    linkedList.reverseList();
                    linkedList.printList();
                    break;
                case 4:
                    System.out.print("찾을 데이터: ");
                    scanner.nextLine();
                    String search = scanner.nextLine();
                    System.out.println(linkedList.searchNode(search).getData());
                    break;
                default:
                    System.out.println("입력이 잘못되었음.");
            }
        }
    }
}
