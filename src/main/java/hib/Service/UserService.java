package hib.Service;

import hib.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void updateUser(User user);

    List<User> listUsers();
     User getUserById(int  id);
    void userDeleteById(int id);
}
