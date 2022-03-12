package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Classname SuiteConfig
 * @Description TODO
 * @Date 2022/3/11 8:39
 * @Created by root
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦！");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest--------------运行啦！");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest--------------运行啦！");
    }
}
