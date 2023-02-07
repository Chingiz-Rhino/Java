package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.company.User.Role.USER;
import static org.junit.jupiter.api.Assertions.*;

class MethodLearnTest {

    MethodLearn methodLearn = new MethodLearn();


    //1. метод который принимает список юзеров и никнейм и возвращает юзера с таким никнеймом, если он есть, а если нет null
    @Test
     void positiveFindUserByNickname() {
        User user1 = new User(0, null, null, "china", null, null);
        User user2 = new User(0, null, null, "chunga", null, null);
        User user3 = new User(0, null, null, "changa", null, null);
        List<User> users = List.of(user1, user2, user3);
        User actualResult = methodLearn.findUserByNickname(users, "china");
        User expectedResult = user1;
        assertEquals(expectedResult, actualResult);
    }




    //2. метод который принимает список юзеров и имя юзера и возвращает всех юзеров с таким именем
    @Test
    void positiveFindAllUsersWithSameName() {
        User user1 = new User(0, null, null, null, null, "batman");
        User user2 = new User(0, null, null, null, null, "Emi");
        User user3 = new User(0, null, null, null, null, "Emil");
        List<User> users = List.of(user1, user2, user3);
        List<User> actualUsers =  methodLearn.findAllUsersWithSameName(users, "Emil");
        List<User> expectedUsers = List.of(user3);
        assertEquals(expectedUsers, actualUsers);
    }

    //3. метод который принимает список юзеров и никнейм и удаляет юзера с таким никнеймом если он есть
    @Test
    void positiveTestDeleteUsersWithSameNickname() {
        User user1 = new User(0, null, null, "chinchin", null, null);
        User user2 = new User(0, null, null, "spider", null, null);
        User user3 = new User(0, null, null, "spiderman", null, null);
        List<User> users = List.of(user1, user2, user3);
        methodLearn.deleteUsersWithSameNickname(users, user1.getNickname());
        List<User> actualResult = users;
        List<User> expectedResult = List.of(user2, user3);
        assertEquals(expectedResult, actualResult);

    }
    //4. метод который принимает список юзеров и возвращает всех юзеров типа юзер
    @Test
    void positiveAllUsersByRole(){
        User user1 = new User(0, null, null, null, User.Role.USER, null);
        User user2 = new User(0, null, null, null, User.Role.ADMIN, null);
        User user3 = new User(0, null, null, null, User.Role.ADMIN, null);
        List<User> users = List.of(user1, user2, user3);
        List<User> actualResult = methodLearn.allUsersByRole(users);
        List<User> expectedResult = List.of(user1);
        assertEquals(expectedResult, actualResult);
    }
    //5. метод который принимает список юзеров и возвращает всех админов
    @Test
    void  positiveAllUsersByAdminRole(){
        User user1 = new User(0, null, null, null, User.Role.ADMIN, null);
        User user2 = new User(0, null, null, null, User.Role.USER, null);
        User user3 = new User(0, null, null, null, User.Role.USER, null);
        List<User> users = List.of(user1, user2, user3);
        List<User> actualResult = methodLearn.allUsersByAdminRole(users);
        List<User> expectedResult = List.of(user1);
        assertEquals(expectedResult, actualResult);
    }
    //6. метод который принимает юзера и никнейм и возвращает результат того соответствует ли этот юзер никнейму или нет
    @Test
    void positiveCheckNicknameForUser(){

    }

}