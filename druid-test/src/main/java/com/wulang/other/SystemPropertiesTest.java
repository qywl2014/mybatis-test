package com.wulang.other;

import java.util.Map;
import java.util.Properties;

public class SystemPropertiesTest {
    public static void main(String[] args) {
        Properties properties=System.getProperties();
        for(Map.Entry entry:properties.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
