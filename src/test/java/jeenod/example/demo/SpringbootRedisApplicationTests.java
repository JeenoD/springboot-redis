package jeenod.example.demo;

import jeenod.example.demo.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test() throws Exception {

        // store data in redis
        User user = new User("Tom", 1);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("Jim", 2);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        Assert.assertEquals(1, redisTemplate.opsForValue().get("Tom").getAge().longValue());
        Assert.assertEquals(2, redisTemplate.opsForValue().get("Jim").getAge().longValue());

    }

}
