package com.sk.SpringSecEx.service;

import com.sk.SpringSecEx.model.Users;
import com.sk.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    @Autowired
    private UserRepo userRepo;
    public Users register(Users user){
        return userRepo.save(user);
    }

}
