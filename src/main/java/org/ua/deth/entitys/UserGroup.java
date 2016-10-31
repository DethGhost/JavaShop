package org.ua.deth.entitys;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user_group")
public class UserGroup {
    @Id
    @SequenceGenerator(name = "user_group_id_seq", sequenceName = "user_group_id_seq",allocationSize = 0)
    @GeneratedValue(generator = "user_group_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "user_group_id")
    private long userGroupId;

    public UserGroup() {
    }

    public String getGroupType() {

        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Column

    private String groupType;

    @OneToMany(mappedBy = "userGroup")
    private List<User> userList = new ArrayList();

    public UserGroup(String groupType, List<User> userList) {
        this.groupType = groupType;
        this.userList = userList;
    }
}
