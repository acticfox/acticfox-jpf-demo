package com.github.acticfox.demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application
 *
 * @author fanyong.kfy
 * @date 2020-11-10 3:58 PM
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.github.acticfox.demo")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
