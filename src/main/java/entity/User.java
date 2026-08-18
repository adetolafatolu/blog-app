package com.tola.blogpost.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userID;
    private String email;
    private String password;
    private String dateJoined;
    private String userName;


    public int getUserID() {
        return userID;
    }
    public void setUserID(int UserID) {
        this.userID = UserID;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String Email) {
        this.email = Email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String Password) {
        this.password = Password;
    }
    public String getDateJoined() {
        return dateJoined;
    }
    public void setDateJoined(String DateJoined) {
        this.dateJoined = DateJoined;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String UserName) {
        this.userName = UserName;
    }


@OneToMany(mappedBy = "user")
private List<BlogPost> blogPosts;

    @OneToMany (mappedBy = "user")
    private List <Comments> comments;
}
