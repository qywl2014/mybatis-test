package com.wulang.javasyntax;

public class ExtendsTest extends A {
    public ExtendsTest(){
        a=2;
        System.out.println("ExtendsTest"+a);
    }
    public static void main(String[] args) {
        new ExtendsTest();
    }
}
