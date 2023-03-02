package com.enki.springboot_reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enki.springboot_reggie.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Enki
 * @Version 1.0
 */
@Mapper
@RequestMapping("/page/category")
public interface CategoryMapper extends BaseMapper<Category> {

}
