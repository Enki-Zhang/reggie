package com.enki.springboot_reggie.contorller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.enki.springboot_reggie.config.R;
import com.enki.springboot_reggie.pojo.Category;
import com.enki.springboot_reggie.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.Oneway;

/**
 * @author Enki
 * @Version 1.0
 */
@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //    category/page?page=1&pageSize=10
    @GetMapping("/page")
    public IPage<Category> getPage(@RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
        log.info("分页", page, pageSize);
        IPage<Category> page1 = categoryService.getPage(page, pageSize);
        long size = page1.getSize();
        System.out.println("大小"+ size);
        log.info("页面信息", page1);
        return page1;


    }


}
