package com.gchsj.login.service;

import com.gchsj.user.domain.User;
import com.gchsj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserService userService;

    public User authUser(String userId, String userPw) {
        return userService.selectUser(new User(userId, userPw));
    }
}
