package com.enki.springboot_reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enki.springboot_reggie.mapper.CategoryMapper;
import com.enki.springboot_reggie.pojo.Category;
import com.enki.springboot_reggie.service.CategoryService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
