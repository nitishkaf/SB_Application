package com.nitish.service;

import com.nitish.entity.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    boolean deleteUser(Long id);
}
