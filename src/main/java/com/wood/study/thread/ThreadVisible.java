package com.wood.study.thread;

public class ThreadVisible extends Thread {
    boolean flag = false;
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("flag修改为 :" + flag);
    }
}
//flag作为成员变量,在new对象的时候被创建在堆空间中(公共的主内存中),而栈空间是线程私有的,每个线程都有一块属于自己的栈空间
//main线程想要操作堆空间的flag,只有从公共的内存中复制一份副本到自己的栈空间中(此时main的flag=false)
//子线程将flag的值修改为true,这一步骤是在方法中执行,而方法又是在线程私有的栈空间中执行,main线程是不知道子线程中flag值被修改的
//至少应该有两个操作:1.子线程修改完flag值后更新到主内存中 2.main线程将最新的值从主内存中拿出来
