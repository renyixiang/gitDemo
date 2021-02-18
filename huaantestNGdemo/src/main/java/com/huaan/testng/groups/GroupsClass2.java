package com.huaan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午8:41
 * @description: 类分组测试2
 */

@Test(groups = "stu")
public class GroupsClass2 {
    public void stu3(){
        System.out.println("GroupsClass2----stu3");
    }
    public void stu4(){
        System.out.println("GroupsClass2----stu4");
    }
}