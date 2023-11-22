package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User newUser);

}
