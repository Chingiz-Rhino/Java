package com.company;

import static org.junit.jupiter.api.Assertions.*;

class MethodLearnTest {

    //1. метод который принимает список юзеров и никнейм и возвращает юзера с таким никнеймом, если он есть, а если нет null
    @org.junit.jupiter.api.Test
     void positiveFindUserByNickname() {
        User user = new User(111, "china", "china","china111", User.Role.USER );
        assertEquals("china111", user.getNickname());
    }
    @org.junit.jupiter.api.Test
    void negativeFindUserByNickname() {
        User user = new User(111, "china", "china","china111", User.Role.USER );
        assertEquals("china", user.getNickname());
    }



    //2. метод который принимает список юзеров и имя юзера и возвращает всех юзеров с таким именем
    @org.junit.jupiter.api.Test
    void positiveFindAllUsersWithSameName() {
        User user = new User(111, "china", "","china111", User.Role.USER);
        assertEquals("china", user.getLogin());
    }
    @org.junit.jupiter.api.Test
    void negativeFindAllUsersWithSameName() {
        User user = new User(111, "china", "","china111", User.Role.USER);
        assertEquals("china11", user.getLogin());
    }

    @org.junit.jupiter.api.Test
    void testDeleteUsersWithSameNickname() {
    }
}