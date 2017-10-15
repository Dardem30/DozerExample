package com.example1.service;

import com.example1.domain.User;
import com.example1.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Роман on 12.10.2017.
 */
@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public void saveUser(User user){
        userDAO.save(user);
    }

    public User getUserById(int id) {
        return userDAO.getById(id);
    }
    public void deleteUser(User user){
        userDAO.delete(user);
    }
}
