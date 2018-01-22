package com.example.demo.controller;

import com.example.demo.Data.UserSaveResponse;
import com.example.demo.persistance.UserData;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @CrossOrigin(origins = "*")
    @RequestMapping(path = "api/logUser", method = RequestMethod.POST)
    public @ResponseBody
    UserSaveResponse login(@RequestBody final UserData userData)
    {
        UserSaveResponse response = loginService.loadUserByUsername(userData);
        return response;
    }

}
