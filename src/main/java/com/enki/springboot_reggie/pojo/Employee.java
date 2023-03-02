package com.enki.springboot_reggie.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Enki
 * @Version 1.0
 */
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String name;//获取列名

    private String password;

    private String phone;

    private String sex;

    private String idNumber;//身份证号码 映射到数据库中自动转为 id_number

    private Integer status;

    private LocalDateTime createTime;
    //插入公共字段 INSERT插入时填充字段
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT)
    private Long createUser;
    //INSERT 和 UPDATE 更新时候填充字段
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateUser;
}
