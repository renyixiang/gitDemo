package com.huaan.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author : huaan9527
 * create at:  2021/2/17  下午8:18
 * @description: 方法分组
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组 test1 ");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组 test2 ");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是服务端组 test3 ");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是服务端组 test4 ");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("beforeGroupsOnServer 这是服务端组之前运行的");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("afterGroupsOnServer 这是服务端组之后运行的");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("beforeGroupsOnClient 这是服务端组之前运行的");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("afterGroupsOnClient 这是服务端组之后运行的");
    }


}