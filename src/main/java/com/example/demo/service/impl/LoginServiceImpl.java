package com.example.demo.service.impl;

import com.example.demo.Data.UserSaveResponse;
import com.example.demo.persistance.UserData;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    public static boolean loggedIn = false;
    private PasswordEncrypter passwordEncryptor = new PasswordEncrypter();

    @Override
    public UserSaveResponse loadUserByUsername(UserData userData) {

        final UserSaveResponse response = new UserSaveResponse();

        final List<UserData> list = userRepository.findByUsername(userData.getUsername());
        if(!list.isEmpty()){
            String password = passwordEncryptor.encode(list.get(0).getPassword());
            if(password.equals(userData.getPassword())){
                response.setMessage("Welcome "+list.get(0).getFirstname()+" !");
                response.setCode(1);
                markLogin();
            }else{
                response.setMessage("Incorrect Username or Password");
                response.setCode(2);
                markLogOff();
            }
        }else{
            response.setMessage("Could not find the User "+"' "+userData.getUsername()+" '");
            response.setCode(2);
            markLogOff();
        }

        return response;
    }

    @Override
    public boolean checkLogin(){
        return loggedIn;
    }

    public void markLogin() {
        loggedIn = true;
    }

    public void markLogOff()
    {
        loggedIn = false;
    }

}
