package com.jphale.discount.user.service;

import com.jphale.discount.user.entity.User;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserByCustomerNumber(String customerNumber);
}
