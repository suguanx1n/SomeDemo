package com.example.rocketmq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author sgx
 * @Date 2024/5/25 17:26
 * @Description:
 */
@Api(value = "Redis测试",tags = {"Redis测试"})
@RestController
@RequestMapping(value = "/redisTest")
public class RedisTest {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @ApiOperation(value = "Redis测试",notes = "Redis测试,设置参数到Redis")
    @GetMapping("/setRedis")
    public String  setRedis(){
        //60秒后过期
        redisTemplate.opsForValue().set("Test:key525", "suguanxin123",60, TimeUnit.SECONDS);
        System.out.println("设置成功");
        return "设置成功";
    }

    @ApiOperation(value = "Redis测试",notes = "Redis测试,从Redis中获取参数")
    @GetMapping("/getRedis")
    public String  getRedis(){
        String value = (String) redisTemplate.opsForValue().get("Test:key525");
        System.out.println(value);
        return value;
    }
}
