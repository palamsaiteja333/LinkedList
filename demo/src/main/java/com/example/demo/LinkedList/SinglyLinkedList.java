package com.example.demo.LinkedList;

//Design a Singly Linked List class.
//
//Your LinkedList class should support the following operations:
//


//void insertHead(int val) will insert a node with val at the head of the list.
//void insertTail(int val) will insert a node with val at the tail of the list.
//bool remove(int i) will remove the ith node (0-indexed). If the index is out of bounds, return false, otherwise return true.
//int[] getValues() return an array of all the values in the linked list, ordered from head to tail.
public class SinglyLinkedList {

    private ListNode head;
    private ListNode tail;

    //LinkedList() will initialize an empty linked list.
    public SinglyLinkedList(){
        this.head = new ListNode(-1);
        this.tail = head;
    }

    //int get(int i) will return the value of the ith node (0-indexed). If the index is out of bounds, return -1.
    public int get(int index) {
        int i = 0;
        ListNode current = head;
        while(i<index && current != null){
            current = current.next;
        }

        return current.val

    }


    public void insertAtHead(int val) {
        ListNode newNode = new ListNode(val);


    }
}
