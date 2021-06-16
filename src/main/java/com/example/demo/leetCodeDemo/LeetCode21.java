package com.example.demo.leetCodeDemo;

import java.util.Optional;

public class LeetCode21 {
    //合并两个升序链表并且合并后还是升序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode l3 = new ListNode(0);
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode node3 = l3;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                node3.next = node1;
                node1 = node1.next;
            }else{
                node3.next = node2;
                node2 = node2.next;
            }
            node3 = node3.next;
        }
        node3.next = node1!=null?node1:node2;
        return l3.next;
    }
}
