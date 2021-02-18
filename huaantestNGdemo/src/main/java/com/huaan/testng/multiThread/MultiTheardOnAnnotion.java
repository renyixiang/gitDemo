package com.huaan.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  下午2:13
 * @description:
 */
public class MultiTheardOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Theard Id :%s%n",Thread.currentThread().getId());
    }
}