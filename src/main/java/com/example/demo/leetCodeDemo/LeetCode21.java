package com.example.demo.leetCodeDemo;

import java.util.Optional;

public class LeetCode21 {
    //合并两个升序链表并且合并后还是升序链表
    //直接使用三个来组合
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
    //还可以使用递归的方式来输出
    ListNode l3 = new ListNode(0);

    public ListNode recursionTwoList(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val>l2.val){
            l2.next = recursionTwoList(l1,l2.next);
            return l2;
        }else{
            l1.next = recursionTwoList(l1.next,l2);
            return l1;
        }
        // l1=[1,3,5] l2=[2.4.6]  1.next = 2  2.next = 【3，5】|【4，6】  3.next ....
        // 输出  1  输出2
    }
}
