package com.huaan.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author : huaan9527
 * create at:  2021/2/18  下午1:31
 * @description: 类中参数化
 */
public class DataProviderTest {

    //----------  所有参数同一个
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + ";age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", 20},
                {"李四", 30},
                {"王五", 40},
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1----name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2----name=" + name + ";age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 10},
                    {"lisi", 20}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"wangwu", 30},
                    {"zhaoliu", 40},
            };
        }
        return result;
    }
}