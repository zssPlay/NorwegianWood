package com.wood.study.thread;
//多线程安全问题3_原子性问题
public class ThreadAtomic {
    public static void main(String[] args) throws InterruptedException {
        //创建任务对象
        ThreadAtomicTask task = new ThreadAtomicTask();
        Thread t1 = new Thread(task);
        t1.start();

        //主线程继续执行
        for (int i = 0; i < 1000; i++) {
            task.count++;
        }
        Thread.sleep(5000);
        //最后打印count的值
        System.out.println(task.count);
    }
}
