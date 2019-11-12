package com.wcy.ssm.controller;

import com.wcy.ssm.beans.User;
import com.wcy.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;
    @RequestMapping("/listall")
    public String findAllUser(Model model){
        List<User> users = userService.findAllUser();
        logger.info(users.toString());
        model.addAttribute("users", users);
        return "list";
    }
}
