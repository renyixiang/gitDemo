package com.huaan.testng;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  上午10:55
 * @description: 异常测试
 *
 * 什么时候会用到异常测试呢？
 *      在我们期望结果为某一个异常时
 *      比如：我们传入了不合法的参数，程序抛出的异常
 *      也就是说我的预期结果就是这个异常
 *
 */
public class ExpectedExpection {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectionFailed(){
        System.out.println("这是我的一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeSuccess(){
        System.out.println("这是一个异常测试");
        throw new RuntimeException();
    }
}