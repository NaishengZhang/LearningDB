package edu.nyu;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class helloJedis {

    @Test
    public void insert() {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("name", "naisheng");
        jedis.set("University", "NYU");
//        Long result1 = jedis.exists("name", "nasheng");
//        Long result2 = jedis.exists("name", "5856ug");
        String result2 = jedis.set("company","cmiot");
        String result1 = jedis.get("company");
        String result3 = jedis.get("name");
        System.out.printf("result1:%s result2:%s result3:%s", result1, result2, result3);

        Long del = jedis.del("University");
        System.out.printf("%ndel = ",del);
    }
}
