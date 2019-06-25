package com.wulang.melotredistest.redis.pool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class LocalRedis {
    public static void main(String[] args) {
        LocalRedis localRedis = new LocalRedis();
        String value = localRedis.get("a");
        System.out.println(value);
    }

    private JedisPool jedisPool = null;

    public LocalRedis() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPool = new JedisPool(jedisPoolConfig, "127.0.0.1", 6379);
//        new Jedis("1",3);

    }

    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        String str = jedis.get(key);
        jedis.close();
        return str;
    }

    public String set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        String str = jedis.set(key, value);
        jedis.close();
        return str;
    }
}

