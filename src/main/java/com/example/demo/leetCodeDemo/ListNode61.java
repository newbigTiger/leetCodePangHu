package com.example.demo.leetCodeDemo;

public class ListNode61 {
    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null || k==0){
            return head;
        }
        ListNode number = head; int num = 1;
        while(number.next!=null)number = number.next;num++;
        k %=num;
        for(int i=0;i<k;i++){
            ListNode start = head;
            ListNode newEnd = null;
            while(head.next != null){
                newEnd = head;
                head = head.next;
            }
            //此时的head就是最末尾的结点,newEnd就是倒数第二个，start就是头节点
            newEnd.next = null;
            head.next = start;
        }
        return head;
    }
}
