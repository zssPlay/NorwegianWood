package com.wood.study.thread;

public class ThreadAtomicTask implements Runnable {
    //定义成员变量
    int count = 0;

    @Override
    public void run() {
        //对count的值进行增加1000次
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //让count自增
            count++;
        }
    }
}
