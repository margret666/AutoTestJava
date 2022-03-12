package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Classname multiThreadOnAnnotation
 * @Description TODO
 * @Date 2022/3/12 17:23
 * @Created by root
 */
public class multiThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void test1(){
        System.out.println("test1>>>>>>>>>>>>>>");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
