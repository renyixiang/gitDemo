package com.huaan.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/18  上午11:39
 * @description: 参数化练习
 */
public class Parameter {

    @Test
    @Parameters({"name","age"})
    public void test1(String name,int age){
        System.out.println("name="+name+"    "+"age="+age);
    }
}