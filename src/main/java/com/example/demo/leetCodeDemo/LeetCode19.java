package com.example.demo.leetCodeDemo;

public class LeetCode19 {
    //删除链表倒数第n个结点 假设需要删除leetcode4 n=3：
    public ListNode removeNthFromEnd(ListNode head,int n){
        //首先预设一个结点
        ListNode pre = new ListNode(0);
        //将该节点的后续放置为需要删除的结点
        pre.next = head;
        //pre leetcode1 leetcode2 leetcode3 leetcode4 leetcode5 leetcode6
        //设置快慢指针
        ListNode start = pre,end = pre;
        //start快指针，使用快指针运行n次，使他领先慢指针；
        while(n!=0){
            start = start.next;
            n--;
        }
        // end leetcode1 leetcode2 start leetcode4 leetcode5 leetcode6
        //此时的start指针距离end距离为n
        while(start.next != null){
            start = start.next;
            end = end.next;
        }
        //leetcode1 leetcode2 end leetcode4 leetcode5 start
        //此时的end已经走到待删除的结点的前一个位置，需要把他的指针指向待删除部分的下一个leetCode
        end.next = end.next.next;
        return pre.next;
    }
}
