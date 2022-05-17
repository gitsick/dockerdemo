package com.docker.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author solang
 * @date 2022-05-08 14:28
 */
@RequestMapping
@RestController
public class AliTestController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/hello")
    public String count() {
        Long count = redisTemplate.opsForValue().increment("count", 1);
        System.out.println();
        return "有" + count + "人访问了该接口!!!!!!!!";
    }
}
