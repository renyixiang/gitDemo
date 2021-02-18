package com.huaan.testng;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午8:10
 * @description: 忽略测试,也就是控制哪些用例执行，哪些用例不执行
 */
public class lgnoreTest {

    @Test
    public void lgnore1(){
        System.out.println("lgnore 执行");
    }

    @Test(enabled = false)//此用例不执行，感觉可以做成封装,不然感觉每个后面都写这个很麻烦
    public void lgnore2(){
        System.out.println("lgnore 跳出不执行");
    }

    @Test(enabled = true)//不写默认为true
    public void lgnore3(){
        System.out.println("lgnore3 执行");
    }

}