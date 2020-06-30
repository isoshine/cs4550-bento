package com.example.cs455020su1shinekimserverjava.models;

public class UserModel {
  private String id;
  private String username;
  private String password;
  private String first;
  private String last;

  //non-essential user information
  private String level;
  private Integer dob;
  private String email;

  //list of recipe IDs -saved recipes

  //list of user IDs -my friends

  //no argument constructor
  public UserModel() {}

  //user can be created without a set level- automatically set to BEGINNER
  public UserModel(String id, String password, String username, String first, String last) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.first = first;
    this.last = last;
    this.level = "BEGINNER";
  }

  //this is the information needed to sign up
  public UserModel(String id, String password, String username, String first, String last, String level) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.first = first;
    this.last = last;
    if (level.equals("BEGINNER") || level.equals("INTERMEDIATE") || level.equals("ADVANCED")) {
      this.level = level;
    }
    else {
      this.level = "BEGINNER";
    }
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getDob() {
    return dob;
  }

  public void setDob(Integer dob) {
    this.dob = dob;
  }
}
