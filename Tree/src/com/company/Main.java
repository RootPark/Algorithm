package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        Node node = new Node(3);
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(4);
        Node node4 = new Node(2);
        Node node5 = new Node(1);
        Node node6 = new Node(9);

        binaryTree.push(node);
        binaryTree.push(node1);
        binaryTree.push(node2);
        binaryTree.push(node3);
        binaryTree.push(node4);
        binaryTree.push(node5);
        binaryTree.push(node6);

        binaryTree.pop(node1);
        binaryTree.removeLastNode();

        System.out.println("BFS");
        binaryTree.printBFS(node);

        System.out.println("DFS");
        binaryTree.printDFS(node);

    }
}
