package com.enki.springboot_reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enki.springboot_reggie.mapper.EmployeeMapper;
import com.enki.springboot_reggie.pojo.Employee;
import com.enki.springboot_reggie.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public IPage<Employee> getPage(Integer page, Integer pageSize) {
        LambdaQueryWrapper<Employee> employeeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<Employee> employeePage = new Page<>(page,pageSize);
        return employeeMapper.selectPage(employeePage, employeeLambdaQueryWrapper);
    }
}
