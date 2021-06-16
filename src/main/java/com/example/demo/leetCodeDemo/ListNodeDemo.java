package com.example.demo.leetCodeDemo;

public class ListNodeDemo {
    public static void main(String[] args) {
        toStringListNode(LeetCode19.removeNthFromEnd(productionListNode(),1));
    }
    public static ListNode productionListNode(){
        ListNode start = new ListNode(1);
        ListNode secound = new ListNode(2);
        ListNode three = new ListNode(8);
        ListNode four = new ListNode(6);
        ListNode five = new ListNode(10);
        ListNode six = new ListNode(9);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(6);
        ListNode night = new ListNode(2);
        ListNode end = new ListNode(0);
        start.next = secound;
        secound.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = night;
        night.next = end;
        return start;
    }
    static void toStringListNode(ListNode listNode){
        System.out.println(listNode.val);
        if(listNode.next!=null){
            toStringListNode(listNode.next);
        }
    }
}
