package com.programs.challenges.hackerrank.linkedlist;

/**
 * Given a singly linked list. Reverse it.
 */
public class ReverseList {
    static Node nodeHead;
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);


        System.out.println("Original -> ");
        printLinkedList(head);


        System.out.println("\nReversed -> ");
        //printLinkedList(reverseIterative(head));
        reverseRecursive(head);
        printLinkedList(nodeHead);


    }

    static void printLinkedList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

    static Node reverseIterative(Node head){

        Node prev = null;
        Node current = head;
        Node next;

        while(current != null){

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;

        }

        head = prev;

        return head;

    }

    static void reverseRecursive(Node node){

        if(node.next == null){
            nodeHead = node;
            return;
        }

        reverseRecursive(node.next);
        Node q = node.next;
        q.next = node;
        node.next = null;
    }
}
