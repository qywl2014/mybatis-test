package com.wulang.melotredistest.redis;

import redis.clients.jedis.Jedis;

public class BaseTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        String value = jedis.get("a");
        System.out.println(value);
    }
}
