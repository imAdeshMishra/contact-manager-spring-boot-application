package com.smart.mycontactmanager.controllers;


import com.smart.mycontactmanager.dao.UserRepository;
import com.smart.mycontactmanager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/test")
    @ResponseBody
    public String test(){

        User user = new User();

        user.setName("Adesh");
        user.setEmail("adb@dev.io");
        userRepository.save(user);

        return "working";

    }
}
