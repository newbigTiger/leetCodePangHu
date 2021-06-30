package com.example.demo.leetCodeDemo;

public class ListNode61 {
    /**
     * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        // 计算有效的 k 值：对于与链表长度成整数倍的「旋转」都是没有意义的（旋转前后链表不变）
        int tot = 0;
        ListNode tmp = head;
        while (tmp != null && ++tot > 0) tmp = tmp.next;
        k %= tot;
        if (k == 0) return head;

        // 使用「快慢指针」找到倒数第 k 个节点（新头结点）：slow 会停在「新头结点」的「前一位」，也就是「新尾结点」
        ListNode slow = head, fast = head;
        while (k-- > 0) fast = fast.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // 保存新头结点，并将新尾结点的 next 指针置空
        ListNode nHead = slow.next;
        slow.next = null;
        // 将新链表的前半部分（原链表的后半部分）与原链表的头结点链接上
        fast.next = head;
        return nHead;
    }
}
