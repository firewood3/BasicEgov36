package com.gchsj.login.controller;

import com.gchsj.login.service.LoginService;
import com.gchsj.user.domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    private static final Logger LOGGER = LogManager.getFormatterLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login/loginRequest", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> loginRequest(HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        LOGGER.info(userId);
        LOGGER.info(userPw);

        User user = loginService.authUser(userId, userPw);
        Map<String, Object> map = new HashMap<>();

        if (user == null) {
            map.put("code", HttpStatus.UNAUTHORIZED);
            map.put("message", "로그인에 실패하였습니다. 아이디와 비밀번호를 확인하세요.");
        } else {
            map.put("code", HttpStatus.OK);
            map.put("message", "로그인 하였습니다.");
            request.getSession().setAttribute("user", user);
        }

        return map;
    }
}
