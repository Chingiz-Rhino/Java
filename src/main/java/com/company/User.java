package com.company;

import lombok.ToString;

@ToString
public class User {
    private int age;
    private String login;
    private String password;
    private String nickname;
    private Role role;


    public User() {
    }

    public User(int age, String login, String password, String nickname, Role role) {
        this.age = age;
        this.login = login;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int id) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    enum Role {
        USER,
        ADMIN

    }
}



