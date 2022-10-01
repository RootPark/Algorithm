package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Node {
    int data;
    Node next = null;
    Node(int data){
        this.data=data;
    }

    void append(int data){
        Node end = new Node(data);
        Node n = this;

        while(n.next!=null){
            n=n.next;
        }
        n.next = end;
    }

    void delete(int data){
        Node n = this;
        while(n.next!=null){
            if(n.next.data==data){
                n.next=n.next.next;
            }
            else{
                n=n.next;
            }
        }
    }

    void retrieve(){
        Node n = this;

    }
}