package com.programs.challenges.hackerrank.linkedlist;

/**
 * Write a GetNth() function that takes a linked list and an integer
 * index and returns the data value stored in the node at that index position.
 * <pre class"code">
 * EXAMPLE
 * Input:  1->10->30->14,  index = 2
 * Output: 30
 * The node at index 2 is 30
 * </pre>
 */
public class NthNode {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println(getNth(head,3));
        System.out.println(getNthRecursive(head,3));
    }

    static int getNthRecursive(Node head, int n){
        int count = 0;
        if(head != null){
            if(count == n)
                return head.data;
            else
                return getNthRecursive(head.next,n-1);
        }
        return -1;
    }

    static int getNth(Node head,int n){
        int count = 0;

        while(head != null){
            if(count == n)
                return head.data;
            count++;
            head = head.next;
        }

        return -1;
    }

}
