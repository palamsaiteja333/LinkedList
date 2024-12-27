package com.example.demo.LinkedList;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int val){
        this(val, null);
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
