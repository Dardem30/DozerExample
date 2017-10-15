package com.example1.controller;

import com.example1.domain.Role;
import com.example1.domain.User;
import com.example1.service.RoleService;
import com.example1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Роман on 14.10.2017.
 */
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping(value = "/restRole/")
public class RestControllerForRole {
    @Autowired
    private RoleService roleService;
    @GetMapping(value = "role/{id}")
    public ResponseEntity<Role> getUserById(@PathVariable int id){
        return new ResponseEntity<Role>(roleService.getRoleById(id), HttpStatus.OK);
    }
    @PutMapping(value = "role/{id}")
    public ResponseEntity<Role> updateUser(@RequestBody Role role, @PathVariable int id){
        Role role1=roleService.getRoleById(id);
        if(role1==null){
            return new ResponseEntity<Role>(role1,HttpStatus.BAD_REQUEST);
        }
        role1.setName(role.getName());
        role1.setUsers(role.getUsers());
        roleService.saveRole(role1);
        return new ResponseEntity<Role>(role1,HttpStatus.OK);
    }
    @PostMapping(value="role")
    public ResponseEntity<Role> saveUser(@RequestBody Role role){
        roleService.saveRole(role);
        return new ResponseEntity<Role>(role,HttpStatus.OK);
    }
    @DeleteMapping(value = "role/{id}")
    public ResponseEntity<Role> deleteUser(@PathVariable int id){
        Role role=roleService.getRoleById(id);
        roleService.deleteRole(role);
        return new ResponseEntity<Role>(role,HttpStatus.OK);
    }
}
