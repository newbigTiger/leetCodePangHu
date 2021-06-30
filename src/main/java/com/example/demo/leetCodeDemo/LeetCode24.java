package com.example.demo.leetCodeDemo;

public class LeetCode24 {
    //两两交换相邻的结点
    static class Solution {
        int i = 0;
        public static ListNode swapPairs(ListNode head) {
            if(head == null||head.next==null){
                return head;
            }
            ListNode nextNode = head.next;
            // 要把  nextNode的next结点换给head,head结点编程nextNode的下一个结点
            head.next = swapPairs(nextNode.next);
            nextNode.next = head;
            return nextNode;
        }
        //1->2->3->4->5->6
        //1.next = swap(3) 2->1  return  2
        //3.nextv=swap(4.next) 4->3 return 4
    }
}
