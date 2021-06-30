package com.example.demo.hashMapDemo;

public class HashCode {

    //计算hashCode的代码
    public static int getHashCode(Integer multiplier,String str){
        int h = 0;
        for(int i=0;i<str.length();i++) {
            h = (h<<5)-h + str.charAt(i);
        }
        return h;
    }

    //扰动函数
    public static int getIndex(Object key){
        int i;
        return key==null?0:(i = key.hashCode())^(i>>>16);
    }

    //通过扰动函数计算后再来获取下标
    public static int getIdx(int size,int index){

        return index&(size-1);
    }

    public static void main(String[] args) {
        //计算hashCode  这样计算是为了让Hash值尽可能的散列分布，降低碰撞几率
        int panghu = getHashCode(31, "胖虎达人");
        System.out.printf("获取HashCode %d ",panghu);
        //1016768756
        //尽可能的散列之后需要根据数组长度和所存放数据的key来定位一个下标，
        // 需要用到扰动函数，使用了扰动函数后会增大数据的随机性，让数据元素更加均衡的散布，减少碰撞
        int index = getIndex(panghu);
        System.out.printf("经过扰动函数计算后的值 %d ",index);
        int idx = getIdx(16, index);
        System.out.println("idx = " + idx);
    }
}
