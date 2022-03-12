//package com.course.testng.groups;
//
//import org.testng.annotations.AfterGroups;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Test;
//
///**
// * @Classname GroupsOnMethod
// * @Description TODO
// * @Date 2022/3/11 13:05
// * @Created by root
// */
//public class GroupsOnMethod {
//
//    @Test(groups = "client")
//    public void test1(){
//        System.out.println("clientTest1-------------1");
//    }
//
//    @Test(groups = "client")
//    public void test2(){
//        System.out.println("clientTest2-------------1");
//    }
//
//    @Test(groups = "server")
//    public void test1_server(){
//        System.out.println("serverTest1-------------1");
//    }
//
//    @Test(groups = "server")
//    public void test2_server(){
//        System.out.println("serverTest2-------------1");
//    }
//
//    @BeforeGroups("client")
//    public void beforeGroupsOnClient(){
//        System.out.println("这是客户端运行之beforeGroupsOnClient的调用方法");
//    }
//
//    @AfterGroups("client")
//    public void afterGroupsOnClient(){
//        System.out.println("这是客户端运行之AfterGroupsOnClient的调用方法");
//    }
//
//    @BeforeGroups("server")
//    public void beforeGroupsOnServer (){
//        System.out.println("这是客户端运行之beforeGroupsOnServer的调用方法");
//    }
//
//    @AfterGroups("server")
//    public void afterGroupsOnServer(){
//        System.out.println("这是客户端运行之AfterGroupsOnServer的调用方法");
//    }
//}

package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法！！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后运行的方法！！！！！");
    }


}

