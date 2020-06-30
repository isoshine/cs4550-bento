package com.example.cs455020su1shinekimserverjava.controllers;

import com.example.cs455020su1shinekimserverjava.models.UserModel;
import com.example.cs455020su1shinekimserverjava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
  /*
  CRUD
  C-Create
  R-Read
  U-Update
  D-Delete
   */

  @Autowired
  UserService userService;

  @PostMapping("/api/users")
  public UserModel createUser(String userId, @RequestBody UserModel newUser) {
    return userService.createUser(newUser);
  }

  @PutMapping("/api/users/{userId}")
  public UserModel updateUser(@PathVariable("userId") String userId, @RequestBody UserModel updatedUser) {
    return userService.updateUser(userId, updatedUser);
  }

  @GetMapping("/api/users")
  public List<UserModel> findAllUsers() {
    return userService.findAllUsers();
  }

  @DeleteMapping("/api/users/{userId}")
  public List<UserModel> deleteUser(@PathVariable("userId") String userId) {
    return userService.deleteUser(userId);
  }

}
