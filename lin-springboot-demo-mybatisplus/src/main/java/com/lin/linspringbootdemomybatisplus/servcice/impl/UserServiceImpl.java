package com.lin.linspringbootdemomybatisplus.servcice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lin.linspringbootdemomybatisplus.entity.User;
import com.lin.linspringbootdemomybatisplus.mapper.UserMapper;
import com.lin.linspringbootdemomybatisplus.servcice.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
