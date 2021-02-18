package com.huaanreport.extentReportDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


/**
 * @author : huaan9527
 * create at:  2021/2/18  下午3:53
 * @description: extent测试报告demo
 */
public class TestExtneter {

    @Test
    public void test1() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void logDemo() {
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我们自己抛的异常");
    }
}