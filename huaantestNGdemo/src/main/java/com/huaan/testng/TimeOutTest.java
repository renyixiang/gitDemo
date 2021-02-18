package com.huaan.testng;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  下午2:50
 * @description: 超时测试
 */
public class TimeOutTest {

    @Test(timeOut = 3000)//毫秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}