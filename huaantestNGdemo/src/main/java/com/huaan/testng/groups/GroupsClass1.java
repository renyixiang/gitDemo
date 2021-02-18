package com.huaan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午8:40
 * @description: 类分组测试1
 */

@Test(groups = "stu")
public class GroupsClass1 {
    public void stu1(){
        System.out.println("GroupsClass1-----stu1");
    }
    public void stu2(){
        System.out.println("GroupsClass1-----stu2");
    }
}