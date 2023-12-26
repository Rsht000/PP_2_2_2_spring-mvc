package hib.dao;

import hib.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void updateUser(User user);

    List<User> listUsers();

    User getUserById(int id);

    void userDeleteById(int id);
}