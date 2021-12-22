package com.yair.countdown;

public class CountDownThread extends Thread{
    private final int rate;
    private int counter;

    public CountDownThread(int rate, int counter) {
        this.rate = rate;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("-- Running a new count down thread (name:" + getName() + ", rate: " + rate/1000 + " seconds, counterStartingPoint: "+ counter + ") --");
        while (true){
            System.out.println(getName() +": " + counter);
            counter--;
            try {
                sleep(rate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (counter == -1){
                return;
            }
        }
    }
}
