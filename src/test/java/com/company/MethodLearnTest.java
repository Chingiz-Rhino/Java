package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodLearnTest {

    MethodLearn methodLearn = new MethodLearn();

    //1. метод который принимает список юзеров и никнейм и возвращает юзера с таким никнеймом, если он есть, а если нет null
    @Test
     void positiveFindUserByNickname() {
        List<User> users = new ArrayList<>();
        User user = methodLearn.findUserByNickname(users, "hulk");
        assertEquals("hulk", "hulk");
    }




    //2. метод который принимает список юзеров и имя юзера и возвращает всех юзеров с таким именем
    @Test
    void positiveFindAllUsersWithSameName() {
    }
    @Test
    void negativeFindAllUsersWithSameName() {

    }

    @Test
    void testDeleteUsersWithSameNickname() {
    }
}