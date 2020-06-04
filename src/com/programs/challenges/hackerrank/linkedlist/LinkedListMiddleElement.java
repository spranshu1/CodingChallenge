package com.programs.challenges.hackerrank.linkedlist;


/**
 * Given a singly linked list find the middle element
 */
public class LinkedListMiddleElement {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        middleElementApproach2(head);

    }

    /**
     * Two pointers approach
     * @param head
     * @return
     */
    static void middleElementApproach1(Node head){
        Node l = head;
        Node r = head;

        if(head != null){
            while(r != null && r.next != null){
                r = r.next.next;
                l = l.next;
            }

            System.out.println("Middle element is : "+l.data);
        }

    }

    /**
     * Odd counter approach
     * @param head
     */
    static void middleElementApproach2(Node head){
        int count = 0;

        Node mid = head;

        while(head != null){
           if(count%2 != 0){
               mid = mid.next;
           }
           count++;
           head = head.next;
        }

        if(mid != null)
            System.out.println("Middle element is : "+mid.data);
    }
}