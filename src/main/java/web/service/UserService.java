package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User newUser);

}
