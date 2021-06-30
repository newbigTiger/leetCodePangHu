package com.example.demo.listDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemoSynchronized {
    public static void main(String[] args) throws InterruptedException {
        List list = Collections.synchronizedList(new ArrayList<>(10));
        Thread thread1 = new Thread(()->{
            list.add(0,"thread1");
        },"Thread1");
        Thread thread2 = new Thread(()->{
            list.add(0,"thread2");
        },"Thread2");

        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println(list.toString());
    }
}
