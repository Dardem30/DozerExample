package com.example1.repository;

import com.example1.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Роман on 12.10.2017.
 */
@Repository
public interface UserDAO extends CrudRepository<User,Integer> {
    public User getById(int id);
}
