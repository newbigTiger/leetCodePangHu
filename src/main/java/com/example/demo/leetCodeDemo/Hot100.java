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

            return null;
        }
    }
}
