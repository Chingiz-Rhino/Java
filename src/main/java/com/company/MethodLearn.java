package com.company;

import java.util.ArrayList;
import java.util.List;


//
//7*. метод который принимает список юзеров и возвращает сгруппированных юзеров по никнейму
//8*. метод который принимает список юзеров и список пар никнейм-роль и каждому юзеру в списке который содержится в списке пар назначает соответствующую роль
public class MethodLearn {

    public static void main(String[] args) {
        MethodLearn methodLearn = new MethodLearn();
        List<User> users = new ArrayList();
        users.add(new User(0, null, null, null, User.Role.USER, null));
        methodLearn.findUserByNickname(users, "hulk");
        methodLearn.findAllUsersWithSameName(users, "china");
        methodLearn.deleteUsersWithSameNickname(users, "chubaka");
        methodLearn.allUsersByRole(users);
        methodLearn.allUsersByAdminRole(users);
        methodLearn.checkNicknameForUser(new User(), "chelentano");


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
    List<User> findAllUsersWithSameName(List<User>users, String name) {
        List<User> listUser = new ArrayList<>();
        for (User user : users) {
            if (user.getName().equals(name)) {
                listUser.add(user);
            }
        }
        return listUser;
    }



    //3. метод который принимает список юзеров и никнейм и удаляет юзера с таким никнеймом если он есть
    void deleteUsersWithSameNickname(List<User>users, String nickname){
        User deleteUser = null;
           for (User usersNickname : users) {
               if(usersNickname.getNickname().equals(nickname)){
                   deleteUser = usersNickname;
                    break;
               }
           }
           if(deleteUser != null){
               users.remove(deleteUser);
           }
       }


    //4. метод который принимает список юзеров и возвращает всех юзеров типа юзер
    List<User> allUsersByRole (List<User> users){
        List<User> takeUser = new ArrayList<>();
        for (User allUser: users) {
            if(allUser.getRole().equals(User.Role.USER)){
                takeUser.add(allUser);
            }
        }
        return takeUser;
    }

    //5. метод который принимает список юзеров и возвращает всех админов
    List<User> allUsersByAdminRole(List<User> users){
      List<User> takeUser = new ArrayList<>();
        for (User allUser: users) {
            if (allUser.getRole().equals(User.Role.ADMIN)){
                takeUser.add(allUser);
            }
        }
        return takeUser;
    }

//6. метод который принимает юзера и никнейм и возвращает результат того соответствует ли этот юзер никнейму или нет
    boolean checkNicknameForUser (User users, String nickname){
        return nickname.equals(users.getNickname());
    }



}
