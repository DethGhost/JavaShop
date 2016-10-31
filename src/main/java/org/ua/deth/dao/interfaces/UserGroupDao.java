package org.ua.deth.dao.interfaces;

import org.ua.deth.entitys.UserGroup;

import java.util.List;

public interface UserGroupDao {

    //Create user group
    public void createUserGroup(UserGroup userGroup);

    //Update some group
    public void updateUserGroup(UserGroup userGroup);

    //Show all group
    public List<UserGroup> showUserGroups();

    //Show group by id
    public void showuserGroupById(long userGroupId);

    //Remove User group
    public void removeUserGroup(long userGroupId);
}
