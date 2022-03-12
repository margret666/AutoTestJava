package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Classname IgnoreTest
 * @Description TODO
 * @Date 2022/3/11 9:06
 * @Created by root
 */
public class IgnoreTest {

    @Test(enabled = true)
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 不执行");
    }

    @Test()
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
