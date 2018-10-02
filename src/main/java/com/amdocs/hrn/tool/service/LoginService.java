package com.amdocs.hrn.tool.service;


import org.springframework.stereotype.Service;


@Service
public class LoginService {
    public boolean validateUser(String userid, String password) {
        // in28minutes, dummy
        return userid.equalsIgnoreCase("sausahu")
                && password.equalsIgnoreCase("password");
    }
}
