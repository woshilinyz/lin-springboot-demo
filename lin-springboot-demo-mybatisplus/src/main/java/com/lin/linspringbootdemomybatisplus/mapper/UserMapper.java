package com.lin.linspringbootdemomybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.linspringbootdemomybatisplus.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectUserList(@Param("userParam") User param);
    User selectUser(@Param("queryParam") User user);
}