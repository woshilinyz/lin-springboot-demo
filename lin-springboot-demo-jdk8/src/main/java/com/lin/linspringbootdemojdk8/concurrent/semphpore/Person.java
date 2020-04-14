package com.lin.linspringbootdemojdk8.concurrent.semphpore;

import lombok.Data;

@Data
public class Person {

    private static final String suffix="号开始乘车";
    private static final String suffix2="号出来了";

    /**
     * 编号
     */
    private Integer no;

    public Person(Integer no) {
        this.no = no;
    }

    public void riding(){

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(this.getNo()).append(suffix));

    }

    public void out(){

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(this.getNo()).append(suffix2));

    }
}
