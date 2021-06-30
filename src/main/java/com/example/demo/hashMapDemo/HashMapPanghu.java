package com.example.demo.hashMapDemo;

import java.util.HashMap;

public class HashMapPanghu {

    static int hashCode = 0;
    static final int DEFAULTLENGTH = 1<<4;
    String [] strings = new String[DEFAULTLENGTH];
    //获取hashCode
    public static int HashCode(String string){
        int h = hashCode;
        if(h == 0 && string.length() !=0){
            char[] strings = string.toCharArray();
            for(int i=0,length = strings.length;i<length;i++){

                h = h*31 + strings[i];
            }
            hashCode = h;
        }
        return h;
    }

    static final int hash(String key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    //存放到数组
    public void add(String string){
        int index = hash(string) &(strings.length-1);
        if(strings[index] == null) {
            strings[index] = string;
        }else{
            strings[index] = strings[index]+"->"+string;
        }
    }
}
