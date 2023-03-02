package com.enki.springboot_reggie.contorller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.enki.springboot_reggie.config.R;
import com.enki.springboot_reggie.pojo.Employee;
import com.enki.springboot_reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.jws.Oneway;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Enki
 * @Version 1.0
 */
@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/login")
    public R<Employee> login(@RequestBody Employee employee, HttpServletRequest request) {
        log.info(employee.getUsername(), employee.getPassword());
//        password 加密
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Employee> employeeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<Employee> eq = employeeLambdaQueryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee one = employeeService.getOne(eq);
        if (eq == null) {
            return R.error("登录失败");
        }
//        用户存在密码对比
        if ((!one.getPassword().equals(password)) || one.getStatus() == 0) {
            return R.error("登录失败");
        }
//        登录成功将信息保存在Session中并返回登录结果、
        request.getSession().setAttribute("employee", one.getId());
        return R.success(one);
    }


}
