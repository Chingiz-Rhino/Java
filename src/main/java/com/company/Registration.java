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
    User administrator = new User(111, "admin", "admin111", "admin", User.Role.ADMIN);

    public void startForm() {
        list.add(administrator);
        System.out.println(" Зарегистрироваться => 1");
        System.out.println(" Войти => 2");
        String login = sc.nextLine();
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
            if (user.getNickname().equals(nik)) {
                System.out.println("Такой юзер есть");
                startForm();

            }
        }

        System.out.print(" Введите возраст => ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 16) {
            System.out.println("Вы слишком молоды");
            startForm();
        }


        System.out.print(" Введите пароль => ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Слишком короткий");
        }


        User user = new User(age, login, password, nik, User.Role.USER);

        list.add(user);

        startForm();
    }

    private void enter() {
        System.out.print(" Введите логин => ");
        String login = sc.nextLine();


        System.out.print(" Введите пароль => ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Слишком короткий");
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
                if (existingUser.getRole() == User.Role.ADMIN) {
                    System.out.println("Выйти => 1");
                    System.out.println("Список юзеров => 2");
                    System.out.println("Информация по конкретному юзеру => 3");
                    System.out.println("Выдать админские права пользователю => 4");
                    String pass = sc.nextLine();
                    int transition = Integer.parseInt(pass);
                    if (transition == 1) {
                        startForm();
                    } else if (transition == 2) {
                        System.out.println(listOfUsers());
                    } else if (transition == 3) {
                        System.out.println("Пока не готово");
                    } else if (transition == 4) {
                        System.out.println("Пока не готово");
                    }

                } else {
                    printUserData(existingUser);
                }
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
        System.out.println("Никнейм " + user.getNickname());
        return user;
    }


    private String listOfUsers() {
        StringBuilder sb = new StringBuilder();
        for (User users : list) {
            sb.append(users);
        }
        return sb.toString();
    }

    private void adminRights() {

    }

}
