package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Classname ParamterTest
 * @Description TODO
 * @Date 2022/3/11 23:18
 * @Created by root
 */
public class ParamterTest {

    @Test
    @Parameters({"name", "age"})
    public void paramTest1(String name, int age){
        System.out.println("name= " + name + "; age= " +age);
    }
}
