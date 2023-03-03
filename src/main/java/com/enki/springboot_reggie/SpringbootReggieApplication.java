package com.enki.springboot_reggie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.enki.config")
public class SpringbootReggieApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootReggieApplication.class, args);
        System.out.println("启动成功");
    }

}
