package com.example.demo.leetCodeDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回是否有这个参数
 */
public class demo1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map = new HashMap();
            for(int i=0;i<nums.length-1;i++){
                if(map.containsKey(target-nums[i])){
                    return new int[]{map.get(target-nums[i]),i};
                }
                map.put(nums[i],i);
            }
            return null;
        }
    }
}
