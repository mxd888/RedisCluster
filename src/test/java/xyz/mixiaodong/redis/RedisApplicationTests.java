package xyz.mixiaodong.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisCluster;
import xyz.mixiaodong.redis.util.RedisUtil;

import java.util.Arrays;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;




    @Test
    void contextLoads() {
        boolean set = redisUtil.set("finally-mi2","Success");
        Object o = redisUtil.get("finally-mi2");
        System.out.println(o.toString());
    }



}
