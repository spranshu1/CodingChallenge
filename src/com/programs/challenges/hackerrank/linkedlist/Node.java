package com.programs.challenges.hackerrank.linkedlist;

class Node{

    Node next;
    int data;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(Node next,int data){
        this.next = next;
        this.data = data;
    }

}