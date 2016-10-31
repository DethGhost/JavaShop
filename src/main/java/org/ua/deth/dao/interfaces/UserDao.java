package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.User;

import java.util.List;

public interface UserDao {
    //Create
    public void createUser(User user);

    //Show all users
    public List<User> showAllUsers();

    // Show by id
    public void showUserById(long userId);

    //Update some user
    public void updateUser(User user);

    //Show user by group
    public void showUserByGroup(long userGroupId);

    //Remove user
    public void removeUser(long userId);
}
