package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.User.Role.USER;


//5. метод который принимает список юзеров и возвращает всех админов
//6. метод который принимает юзера и никнейм и возвращает результат того соответствует ли этот юзер никнейму или нет
//
//7*. метод который принимает список юзеров и возвращает сгруппированных юзеров по никнейму
//8*. метод который принимает список юзеров и список пар никнейм-роль и каждому юзеру в списке который содержится в списке пар назначает соответствующую роль
public class MethodLearn {
    public static void main(String[] args) {

    }

    //1. метод который принимает список юзеров и никнейм и возвращает юзера с таким никнеймом, если он есть, а если нет null
    User findUserByNickname(List<User> users, String nickname) {
        for (User user : users) {
            if (user.getNickname().equals(nickname)) {
                return user;
            }
        }
        return null;
    }

    //2. метод который принимает список юзеров и имя юзера и возвращает всех юзеров с таким именем
    List<User> findAllUsersWithSameName(List<User>list, String login) {
        List<User> listUser = new ArrayList<>();
        for (User usersName : list) {
            if (usersName.getLogin().equals(login)) {
                listUser.add(usersName);
            }
        }
        return listUser;
    }



    //3. метод который принимает список юзеров и никнейм и удаляет юзера с таким никнеймом если он есть
    void deleteUsersWithSameNickname(List<User>list, String nickname){
           for (User usersNickname : list) {
               if(usersNickname.getNickname().equals(nickname)){
                    list.remove(usersNickname);
               }
           }
       }


    //4. метод который принимает список юзеров и возвращает всех юзеров типа юзер
    List<User> allUsersByRole (List<User> list){
        List<User> takeUser = new ArrayList<>();
        for (User allUser: list) {
            if(allUser.getRole().equals(User.Role.USER)){
                takeUser.add(allUser);
            }
        }
        return takeUser;
    }

    //5. метод который принимает список юзеров и возвращает всех админов
    List<User> allUsersByAdminRole(List<User> list){
      List<User> takeUser = new ArrayList<>();
        for (User allUser: list) {
            if (allUser.getRole().equals(User.Role.ADMIN)){
                takeUser.add(allUser);
            }
        }
        return takeUser;
    }
}
