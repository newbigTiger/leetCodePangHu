package com.example.demo.thread;

import java.util.concurrent.CompletableFuture;

public class CompareFutureDemo {
    public static User demo() {
        User user = new User();
        CompletableFuture<User> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            user.setAge("23");
            return user;
        });
        CompletableFuture<User> completableFuture1 = CompletableFuture.supplyAsync(() -> {

            user.setName("胖虎");
            user.setAge("24");
            return user;
        });
        CompletableFuture.allOf(completableFuture, completableFuture1).join();
        return user;
    }

    public static void main(String[] args) {

    }
}
