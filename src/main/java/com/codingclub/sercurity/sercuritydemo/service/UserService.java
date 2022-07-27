package com.codingclub.sercurity.sercuritydemo.service;

import com.codingclub.sercurity.sercuritydemo.entity.Role;
import com.codingclub.sercurity.sercuritydemo.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoletoUser(String userName, String roleName);
    User getUSer(String username);
    List<User> getUsers();
}
