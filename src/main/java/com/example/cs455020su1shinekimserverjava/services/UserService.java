package com.example.cs455020su1shinekimserverjava.services;

import com.example.cs455020su1shinekimserverjava.models.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
  private List<UserModel> users = new ArrayList<UserModel>();


  public UserModel createUser(UserModel newUser) {
    newUser.setId(UUID.randomUUID().toString());
    this.users.add(newUser);
    return newUser;
  }

  public UserModel updateUser(String userId, UserModel updatedUser) {
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getId().equals(userId)) {
        updatedUser.setId(userId);
        users.set(i, updatedUser);
        return updatedUser;
      }
    }
    return null;
  }

  public List<UserModel> findAllUsers() {
    return users;
  }

  public UserModel findUserById(String userId) {
    for (UserModel u: users) {
      if (u.getId().equals(userId)) {
        return u;
      }
    }
    return null;
  }

  public List<UserModel> deleteUser(String userId) {
    List<UserModel> result = new ArrayList<UserModel>();
    for (UserModel u: users) {
      if (!u.getId().equals(userId)) {
        result.add(u);
      }
    }
    this.users = result;
    return result;
  }

}
