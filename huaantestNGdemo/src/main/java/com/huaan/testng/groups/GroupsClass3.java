package com.huaan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午8:41
 * @description: 类分组测试3
 */

@Test(groups = "teacher")
public class GroupsClass3 {
    public void teacher1(){
        System.out.println("GroupsClass3---teacher1");
    }
    public void teacher2(){
        System.out.println("GroupsClass3---teacher2");
    }
}