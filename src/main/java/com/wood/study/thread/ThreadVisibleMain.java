package com.wood.study.thread;
//多线程安全问题1_可见性问题
public class ThreadVisibleMain {
    public static void main(String[] args) {
        System.out.println("主线程开始执行了...");
        ThreadVisible threadVisible = new ThreadVisible();
        threadVisible.start();
        while (true){
            if (threadVisible.flag){
                System.out.println("线程执行了...");
            }
        }
    }
}
