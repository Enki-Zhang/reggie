package com.enki.springboot_reggie.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.enki.springboot_reggie.pojo.Employee;

/**
 * @author Enki
 * @Version 1.0
 */
public interface EmployeeService extends IService<Employee> {
    IPage<Employee> getPage(Integer page,Integer pageSize);
}
