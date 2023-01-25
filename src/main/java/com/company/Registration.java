package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Registration {

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.startForm();
    }

    private final ArrayList<User> list = new ArrayList<User>();
    List<String> user = new ArrayList<>();




    Scanner sc = new Scanner(System.in);


    public void startForm() {
        System.out.println(" Зарегистрироваться => 1");
        System.out.println(" Войти => 2");
        String login = sc.nextLine();
        user.add("Admin");
        int enterLog = Integer.parseInt(login);
        if (enterLog == 1) {

            reg();
        } else if (enterLog == 2) {
            enter();
        } else {
            System.out.println(" ТЫ НЕ ПРОЙДЁШЬ! ");
        }


    }

    private void reg() {
        System.out.print(" Введите логин => ");
        String login = sc.nextLine();


        System.out.print(" Введите никнейм => ");
        String nik = sc.nextLine();
        User existingUser = null;
        for (User user : list) {
            if (user.getNik().equals(nik)) {
                System.out.println("Такой юзер есть");
                startForm();

            }
        }

        System.out.print(" Введите возраст => ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 16) {
            System.out.println(" Брысь !");
            startForm();
        }


        System.out.print(" Введите пароль => ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Не короче длины твоего члена!");
        }


        User user = new User(age, login, password, nik);

        list.add(user);

        startForm();
    }

    private void enter() {
        System.out.print(" Введите логин => ");
        String login = sc.nextLine();


        System.out.print(" Введите пароль => ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Не короче длины твоего члена!");
        }
        User existingUser = null;
        for (User user : list) {
            if (user.getLogin().equals(login)) {
                existingUser = user;
                break;
            }
        }
        if (existingUser != null) {
            if (existingUser.getPassword().equals(password)) {
                printUserData(existingUser);
            } else {
                System.out.println("Пароль неверный");
            }

        } else {
            System.out.println("Такого юзера нет");
            startForm();
        }


    }


    private User printUserData(User user) {
        System.out.println(" Логин " + user.getLogin());
        System.out.println("Пароль " + user.getPassword());
        System.out.println("Возраст " + user.getAge());
        System.out.println("Никнейм " + user.getNik());
        return user;
    }


}
