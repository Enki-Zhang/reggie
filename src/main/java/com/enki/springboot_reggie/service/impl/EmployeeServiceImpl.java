package com.enki.springboot_reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.enki.springboot_reggie.mapper.EmployeeMapper;
import com.enki.springboot_reggie.pojo.Employee;
import com.enki.springboot_reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author Enki
 * @Version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
