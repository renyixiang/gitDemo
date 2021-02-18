package com.huaan.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午7:48
 * @description: 套件配置文件
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite测试套件");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
}