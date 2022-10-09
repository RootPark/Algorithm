package com.company;

public interface BT {

    void push(Node nd);
    int pop(Node node);
    boolean contain(Node node);
    Node removeLastNode();
    boolean isSame(Node a, Node b);
    void printBFS(Node node);
    void printDFS(Node node);

}
