package com.example.demo.leetCodeDemo;

import java.util.*;

public class LeetCode23 {
    //传入一个ListNode[[],[],[]]合并为一个ListNode升序

    static class Solution {
        public static ListNode mergeKLists(ListNode[] lists) {
            if(lists == null){
                return null;
            }
            if(lists.length==0){
                return null;
            }
            ArrayList<Integer> integers = new ArrayList<>();
            Arrays.stream(lists).forEach(item->{
                ListNode listNode = item;
                while(listNode !=null) {
                    integers.add(listNode.val);
                    listNode = listNode.next;
                }
            });
            if(integers.isEmpty()){
                return null;
            }
            Collections.sort(integers);
            ListNode listNode = new ListNode(0);
            ListNode start = listNode;
            for (Integer integer : integers) {
                ListNode listNode1 = new ListNode(integer);
                start.next = listNode1;
                start = start.next;
            }
            return listNode.next;
        }
    }
}
