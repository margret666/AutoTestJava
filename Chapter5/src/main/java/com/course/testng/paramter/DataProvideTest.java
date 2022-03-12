package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Classname DataProvideTest
 * @Description TODO
 * @Date 2022/3/12 14:29
 * @Created by root
 */
public class DataProvideTest {

    @Test(dataProvider = "data")
    public void testProviderTest(String name, int age){
        System.out.println("name= " + name + "; age= " +age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{
                {"zhangsan",10},
                {"lisi", 18},
                {"wangwu", 25}
        };
        return obj;
    }
}


