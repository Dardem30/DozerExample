package com.example1.controller;

import com.example1.domain.User;
import com.example1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Роман on 12.10.2017.
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MainController {
    UserService userService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user")User user){
        userService.saveUser(user);
        return "index";
    }
}
