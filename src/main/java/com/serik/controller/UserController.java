package com.serik.controller;

import com.serik.dto.UserDTO;
import com.serik.implementation.RoleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("roleList", new RoleServiceImpl().findAll());

        return "/user/create";
    }
}
