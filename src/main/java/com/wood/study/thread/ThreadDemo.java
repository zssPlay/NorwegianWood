package com.wood.study.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        //匿名内部类可以快速的创建一个类的子类对象和实现类对象
        //1.继承方式:匿名内部类简化
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 300; i++) {
                    System.out.println("打游戏"+i);
                }
            }
        }.start();
        //2.实现方式:匿名内部类简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.out.println("听音乐"+i);
                }
            }
        }).start();
        //主线程
        for (int i = 0; i < 300; i++) {
            System.out.println("吃瓜子"+i);
        }
    }
}
