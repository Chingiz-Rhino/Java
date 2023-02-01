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




    @org.junit.jupiter.api.Test
    void testFindAllUsersWithSameName() {

    }

    @org.junit.jupiter.api.Test
    void testDeleteUsersWithSameNickname() {
    }
}