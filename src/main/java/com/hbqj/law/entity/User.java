package com.hbqj.law.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;

@Table(name = "role")
public class User extends BaseModel {
    /**
     * 自增id
     */
    @Column(name = "role_id", type = MySqlTypeConstant.INT, isNull = false,
            isKey = true, isAutoIncrement = true, comment = "自增id")
    private Long roleId;
    /**
     * 角色名字
     */
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String name;
    /**
     * 角色的中文名字
     */
    @Column(name = "name_zh", type = MySqlTypeConstant.VARCHAR, isNull = true, length = 20, comment = "角色的中文名字")
    private String nameZh;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}