package com.example1.controller;

import com.example1.config.DozerConfig;
import com.example1.domain.User;
import com.example1.dto.RoleDTO;
import com.example1.dto.UserDTO;
import com.example1.dto.UserResponse;
import com.example1.dto.UsersResponse;
import com.example1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Created by Роман on 13.10.2017.
 */
@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping(value = "/restUser/",produces = APPLICATION_JSON_UTF8_VALUE)
public class RestControllerForUser {
    @Autowired
    private UserService userService;
    @Autowired
    private DozerBeanMapper dozerBeanMapper;
    @GetMapping(value = "user/{id}")
    public ResponseEntity getUserById(@PathVariable int id){
        User user=userService.getUserById(id);
        UserResponse userResponse=dozerBeanMapper.map(user, UserResponse.class);
        return ResponseEntity.ok().body(userResponse);
    }
    @PutMapping(value = "user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable int id){
        User user1=userService.getUserById(id);
        if(user1==null){
            return new ResponseEntity<User>(user1,HttpStatus.BAD_REQUEST);
        }
        user1.setName(user.getName());
        user1.setLastname(user.getLastname());
        user1.setPassword(user.getPassword());
        user1.setUsername(user.getUsername());
        user1.setPhoto(user.getPhoto());
        userService.saveUser(user1);
        return new ResponseEntity<User>(user1,HttpStatus.OK);
    }
    @PostMapping(value="user")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        userService.saveUser(user);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
    @DeleteMapping(value = "user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id){
        User user=userService.getUserById(id);
        userService.deleteUser(user);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }
}
