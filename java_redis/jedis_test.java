/*************************************************************************
	> File Name: jedis_test.java
	> Author: wk
	> Mail: 18402927708@163.com
	> Created Time: Sat 21 Oct 2017 02:30:00 PM CST
 ************************************************************************/

//最简单的使用jedis操作redis

import redis.clients.jedis.Jedis;

public class jedis_test {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);
        if (jedis != null) {
            System.out.println("connect to redis server sucessfully");
        }
        jedis.set("name", "weikai");
        System.out.println(jedis.get("name"));
    }
}
