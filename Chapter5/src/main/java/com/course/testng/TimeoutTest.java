package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Classname TimeoutTest
 * @Description TODO
 * @Date 2022/3/11 8:34
 * @Created by root
 */
public class TimeoutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)
    public void testFailure() throws InterruptedException {
        Thread.sleep(5000);
    }
}
