package com.gchsj.user.service;

import com.gchsj.user.domain.User;
import com.gchsj.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(User user) {
        return userMapper.select(user);
    }
}
