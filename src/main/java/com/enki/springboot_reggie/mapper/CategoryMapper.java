package com.enki.springboot_reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enki.springboot_reggie.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Enki
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
