package com.huaan.testng;

import org.testng.annotations.*;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午6:17
 * @description: testNG基本注解
 * 最重要的是执行顺序：
 * 测试套件BeforeSuite --> BeforeClass --> BeforeMethod --> Test1 --> AfterMethod -->  BeforeMethod  --> Test2 -->  AfterMethod --> AfterClass --> AfterSuite
 * Test         表示为测试用例
 * BeforeMethod 每个测试用例执行前执行
 * AfterMethod  每个测试用例执行后执行
 * BeforeClass  每个类执行前执行
 * AfterClass   每个类执行后执行
 * BeforeSuite  测试套件类执行前执行，仅执行一次
 * AfterSuite   测试套件类执行后执行，仅执行一次
 */
public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("testCase1 这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("testCase2 这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod 这是在测试方法之前执行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod 这是在测试方法之后执行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass 这是在类运行之前执行的");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass 这是在类运行之后执行的");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite 这是测试套件");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite 这是测试套件");
    }
}