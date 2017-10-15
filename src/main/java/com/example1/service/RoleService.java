package com.example1.service;

import com.example1.domain.Role;
import com.example1.domain.User;
import com.example1.repository.RoleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Роман on 14.10.2017.
 */
@Service
public class RoleService {
    @Autowired
    private RoleDAO roleDAO;
    public Role getRoleById(int id){
        return roleDAO.findOne(id);
    }
    public void saveRole(Role role){
        roleDAO.save(role);
    }
    public void deleteRole(Role role){
        roleDAO.delete(role);
    }
}
