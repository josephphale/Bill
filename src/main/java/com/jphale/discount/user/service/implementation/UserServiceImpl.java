package com.jphale.discount.user.service.implementation;

import com.jphale.discount.user.entity.User;
import com.jphale.discount.user.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final com.jphale.discount.user.repository.IUserRepository IUserRepository;

    @Override
    public User createUser(User user) {
        return IUserRepository.save(user);
    }

    @Override
    public List<User> getAllUsers(){
        return IUserRepository.findAll();
    }

    @Override
    public User getUserByCustomerNumber(String customerNumber) {
        return IUserRepository.findUserByCustomerNumber(customerNumber);
    }

}
