package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Classname multiThreadOnXml
 * @Description TODO
 * @Date 2022/3/12 20:14
 * @Created by root
 */
public class multiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("test1>>>>>>>Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2>>>>>>>Thread Id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3>>>>>>>Thread Id: %s%n", Thread.currentThread().getId());
    }
}
