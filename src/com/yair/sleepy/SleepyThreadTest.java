package com.yair.sleepy;

public class SleepyThreadTest {
    public static void main(String[] args) {
        Thread t1 = new SleepyThread(3000);
        Thread t2 = new SleepyThread(1000);
        t1.start();
        t2.start();
    }
}