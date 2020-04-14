package com.lin.linspringbootdemojdk8.concurrent.semphpore;

import java.util.concurrent.Semaphore;

public class RideThread implements Runnable {

    private Semaphore semp;

    private Person person;

    public RideThread(Semaphore semp, Person person) {
        this.semp = semp;
        this.person = person;
    }

    @Override
    public void run() {

        try {

            // 获取许可
            semp.acquire();

            person.riding();

            Thread.sleep((long) (Math.random() * 10000));

            person.out();
            // 访问完后，释放
            semp.release();


        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    };
}