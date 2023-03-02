package com.enki.springboot_reggie.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.enki.springboot_reggie.pojo.Category;

/**
 * @author Enki
 * @Version 1.0
 */
public interface CategoryService extends IService<Category> {
    IPage<Category> getPage(Integer page,Integer pageSize);


}
