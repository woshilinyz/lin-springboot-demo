package com.lin.linspringbootdemojdk8.concurrent.semphpore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemphoreTest {

    public static final Integer personNums=10;

    public static void main(String[] args) {
        // 线程池
        ExecutorService exec = Executors.newCachedThreadPool();

        // 只能4个人能同时上车
        final Semaphore semp = new Semaphore(4);

        // 模拟10个人乘车
        for (int index = 0; index < personNums; index++) {

            final int NO = index;

            Person person = new Person(NO);

            exec.submit(new RideThread(semp,person));

        }

        System.out.println(semp.isFair());

        // 退出线程池

        exec.shutdown();
    }
}