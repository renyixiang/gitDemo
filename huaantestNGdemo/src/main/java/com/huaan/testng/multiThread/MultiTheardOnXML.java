package com.huaan.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  下午2:12
 * @description: XML运行多线程
 */
public class MultiTheardOnXML {
    @Test
    public void test1(){
        System.out.printf("Theard Id :%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Theard Id :%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Theard Id :%s%n",Thread.currentThread().getId());
    }
}