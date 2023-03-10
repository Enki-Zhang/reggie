package com.enki.springboot_reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enki.springboot_reggie.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Enki
 * @Version 1.0
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
