package com.enki.springboot_reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enki.springboot_reggie.mapper.CategoryMapper;
import com.enki.springboot_reggie.pojo.Category;
import com.enki.springboot_reggie.service.CategoryService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public IPage<Category> getPage(Integer page, Integer pageSize) {
        LambdaQueryWrapper<Category> LQW = new LambdaQueryWrapper<>();
        Page<Category> categoryPage = new Page<>();
        return categoryMapper.selectPage(categoryPage,LQW);
    }
}
