package com.wulang.localdatabase;

import com.wulang.localdatabase.model.UserFollow;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class OtherTest {
    @Test
    public void test() {
        Method[] methods = UserFollow.class.getMethods();
        for (Method method : methods) {
            if (method.getName().equals("setDtime")) {
                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    System.out.println(parameter.getName());
                }
            }
        }
    }
}