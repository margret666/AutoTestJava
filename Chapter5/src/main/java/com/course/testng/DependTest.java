package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Classname DependTest
 * @Description TODO
 * @Date 2022/3/11 23:08
 * @Created by root
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
