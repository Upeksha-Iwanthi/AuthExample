package com.example.demo.service;

import com.example.demo.Data.UserSaveResponse;
import com.example.demo.persistance.UserData;

public interface LoginService {

    public UserSaveResponse loadUserByUsername(UserData userData);

    public boolean checkLogin();

    public void markLogin();

    public void markLogOff();

}
