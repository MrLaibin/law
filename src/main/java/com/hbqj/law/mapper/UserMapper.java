package com.hbqj.law.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hbqj.law.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
