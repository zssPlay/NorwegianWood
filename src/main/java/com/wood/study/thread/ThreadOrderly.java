package com.wood.study.thread;
//多线程安全问题2_有序性问题
public class ThreadOrderly {
    boolean flag = true;

    public void show1(){//线程一要执行的方法
        int a = 10;
        int b = 20;
        int c = 30;
        flag = false;
    }
    public void show2(){//线程二要执行的方法
        if (flag == true){
            System.out.println("hello");
        }
    }
}
//在编译时,如果代码的先后顺序调整是没有影响的,那么编译器会对代码进行重排序
//在多线程的程序下,重排序可能会对程序的结果造成影响
