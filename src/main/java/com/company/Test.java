package com.company;

import java.util.List;

//мдификатор доступа _ возвращаемый тип _ название метода _ (параметры метода) {
//тело метода
//return объект того типа который ты указал как возвращаемый тип
//}
public class Test {
    //метод принимает 2 числа и возвращает стрингу. должен быть доступен везде

    public String twoInt(int num1, int num2) {
        String str = "Z"; //Тип название = "значение"
        return "конкретное значение которое я возвращаю";
    }

    public static void main(String[] args) {
        Test test = new Test(); //что бы вызвать метод twoInt нужен объект класса - Test test = new Test();
        String str = test.twoInt(2, 1);
        Double dobble = test.fignya(1, "рука");
        User administrator = test.createUser(111, "login", "password", "nickname", User.Role.ADMIN);
        System.out.println(administrator);
        User user = test.createUser(111, "login", "password", "nickname", User.Role.USER);
        System.out.println(user);
        String met = test.metod();
        test.str("Мясо");
        test.xyunya();
    }

    //метод принимает 1 число, 1 стрингу и возвращает дробное число. должен быть доступен только внутри класса
    private Double fignya(int num1, String str) {
        return 0.1;
    }

    //метод ничего не принимает но возвращает стрингу
    String metod() {
        return "что то";
        // Если возвращает стринг - значит возвращаемый тип тоже стринг(Сначала возвращаемы тип, потом то что возвращает)
    }

    //метод ничего не возвращает но принимает стрингу
    void str(String string) {
    }

    //метод принимает возраст, логин, пароль, никнейм, роль  и возвращает юзера с этими параметрами
    User createUser(int age, String login, String password, String nickname, User.Role role) {
        System.out.println("Метод начал свыоё выпаолнение");
        System.out.println(age);
        System.out.println(login);
        System.out.println(password);
        System.out.println(nickname);
        System.out.println(role);
        System.out.println("Метод закончил ");
        return new User(age, login, password, nickname, role);

    }

    // Ничего не принимает, ничего не возвращает
    void xyunya() {

    }

    //метод который принимает юзера и возвращает является ли он админом
    Boolean isAdmin(User user) {
        // Если вводимый юзер является админом вернуть тру
        //Идетнифицировать по роли админ это или нет
        if (user.getRole() == User.Role.ADMIN) {
            return true;
        } else {
            return false;
        }
    }

    //метод принимает список юзеров и никнейм юзера. если юзер с таким никнеймом есть в списке то вернуть его, если нет вернуть null
    User findUserByNickname(List<User> users, String nickname) {
        for (User user : users) {
            //Сравнить никнеймы
            if (user.getNickname().equals(nickname)) {
                return user;
            }

        }
        return null;
    }

}


class Car {
    public void turnWheel() {

    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}

