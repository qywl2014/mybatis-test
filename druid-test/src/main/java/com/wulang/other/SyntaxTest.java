package com.wulang.other;

public class SyntaxTest {
    public static void main(String[] args) {
        Object o=new Object(){
            @Override
            public String toString() {
                return "666";
            }
        };
        System.out.println(o.getClass());
        System.out.println(o);
    }
}
