package com.enki.springboot_reggie;

import com.enki.springboot_reggie.pojo.Category;
import com.enki.springboot_reggie.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.Oneway;
import java.util.List;

@SpringBootTest
class SpringbootReggieApplicationTests {
    @Autowired
    private CategoryService categoryService;

    @Test
    void contextLoads() {
        List<Category> list = categoryService.list();
        list.forEach(System.out::println);
    }

}
