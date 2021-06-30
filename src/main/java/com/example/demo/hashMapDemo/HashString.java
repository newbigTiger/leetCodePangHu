package com.example.demo.hashMapDemo;

import java.io.Serializable;
import java.util.Arrays;

public class HashString implements Serializable {
    class Node{
         int value;
         Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    static Node[]staticnodes = new Node[10];
    static  int index = 0;
    static  int catchIndex = 0;
    static Node head ;
    static Node next;
    static Node util;
    final void add(int x){
        Node [] nodes ;
        Node newHead;
        if((nodes = staticnodes) == null||index==0){
            head = new Node(x,null);
            newHead = head;
            catchIndex = x;
            nodes[index] = newHead;
        }else{
            next = new Node(x,null);
            if(x - catchIndex ==1){
                newHead = head;
                newHead.setNext(next);
                catchIndex = x;
            }else{
                newHead = next;
                index++;
                nodes[index] = newHead;
            }
            head = next;
        }
    }
    public void tString(){
        Arrays.toString(staticnodes);
    }
}
