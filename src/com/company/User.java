package com.company;
import java.util.Scanner;




    public class User {
        private int age;
        private String login;
        private String password;
        private String nik;

        public User(){
        }
        public User(int age, String login, String password, String nik){
            this.age = age;
            this.login = login;
            this.password = password;
            this.nik = nik;
        }
        public int getAge(){return age;}
        public void setAge(int id){this.age = age;}
        public String getLogin(){return login;}
        public void setLogin(String login){this.login = login;}
        public String getPassword(){return password;}
        public void setPassword(String password){this.password = password;}
        public String getNik(){return nik;}
        public void setNik(String nik){this.nik = nik;}

    }


