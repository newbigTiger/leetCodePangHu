package com.example.demo.leetCodeDemo;

import java.util.Arrays;
import java.util.HashMap;

public class Hot100 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int res[] = new int[2];
            if(nums == null||nums.length<=0){
                return res;
            }
            HashMap<Integer,Integer>hashMap = new HashMap<>(nums.length);
            for(int i=0;i<nums.length;i++){
                int x = target - nums[i];
                if(hashMap.containsKey(x)){
                    res[1] = i;
                    res[0] = hashMap.get(x);
                }
                hashMap.put(nums[i],i);
            }
            return res;
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if(l1==null){
                return l2;
            }
            if(l2 == null){
                return l1;
            }
            HashMap<Integer,Integer>listNodel1 = new HashMap<>();
            HashMap<Integer,Integer>listNodel2 = new HashMap<>();
            int i1 = 0;
            while(l1 != null){
                listNodel1.put(i1,l1.val);
                l1 = l1.next;
                i1++;
            }
            int i2 = 0;
            while(l2 != null){
                listNodel2.put(i2,l2.val);
                l2 = l2.next;
                i2++;
            }
            int length = listNodel1.size()>listNodel1.size()? listNodel1.size() : listNodel2.size();
            for(int i=0;i<length;i++){
                
            }
            return null;
        }
    }
}
