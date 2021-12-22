package com.yair.sleepy;

public class SleepyThread extends Thread {
    private int rate;

    public SleepyThread(int rate) {
        this.rate = rate;
    }

    @Override
    public void run() {
        System.out.println("-- Running a new sleepy thread (name: " + getName() + " rate: " + rate/1000 + " seconds) --");
        while (true){
            System.out.println(getName() + ": I'm awake!");
            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
