package com.wulang;

public class Application {
    public static void main(String[] args) {

        Object wait=new Object();
        synchronized (wait){
            try {
                wait.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
