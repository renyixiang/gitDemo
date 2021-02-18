package com.huaan.testng;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  上午11:19
 * @description: 方法依赖测试
 *              以下为test2执行前需要依赖test1执行，实战中test1可做为前置条件
 *
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();//抛出异常
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}