package org.javaboy.cors_security;

import org.springframework.web.bind.annotation.*;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
@CrossOrigin("*")
public class HelloController {
    @PostMapping("/post")
    public String post() {
        return "hello post";
    }

    @PutMapping("/put")
    public String put() {
        return "hello put";
    }

    @GetMapping("/get")
    public String get() {
        return "hello get";
    }
}
