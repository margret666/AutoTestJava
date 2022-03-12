package com.course.testng;

import org.testng.annotations.*;

/**
 * @Classname BasicAnnotation
 * @Description TODO
 * @Date 2022/3/10 12:48
 * @Created by root
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("testCase1这是测试注解");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println("testCase2这是测试注解");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是测试之前需要执行的方法");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod:这是测试之后需要执行的方法");
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("beforeClass:这是测试之前需要执行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass:这是测试之后需要执行的方法");
    }
}
