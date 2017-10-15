package com.example1.repository;

import com.example1.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Роман on 14.10.2017.
 */
public interface RoleDAO extends CrudRepository<Role, Integer> {
}
