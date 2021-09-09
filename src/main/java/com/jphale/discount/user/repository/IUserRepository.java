package com.jphale.discount.user.repository;

import com.jphale.discount.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
    User findUserByCustomerNumber(String customerNumber);
}
