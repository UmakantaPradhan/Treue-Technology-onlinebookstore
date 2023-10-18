package com.test.service;

import javax.servlet.http.HttpSession;

import com.test.model.StoreException;
import com.test.model.User;
import com.test.model.UserRole;

public interface UserService {

    public User login(UserRole role, String email, String password, HttpSession session) throws StoreException;

    public String register(UserRole role, User user) throws StoreException;

    public boolean isLoggedIn(UserRole role, HttpSession session);

    public boolean logout(HttpSession session);

}
