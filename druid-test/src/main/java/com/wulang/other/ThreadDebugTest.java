package com.wulang.other;

public class ThreadDebugTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                int count=0;
                while (true){
                    try {
                        Thread.sleep(2000);
                        count++;
                        System.out.println("thread   "+count);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        int count=0;
        while (true){
            try {
                Thread.sleep(2000);
                count++;
                System.out.println("main   "+count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
