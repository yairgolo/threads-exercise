package com.yair.countdown;

public class CountDownThreadTest {
    public static void main(String[] args) {
        Thread t1 = new CountDownThread(1000, 30);
        Thread t2 = new CountDownThread(3000, 10);
        t1.start();
        t2.start();
    }
}
