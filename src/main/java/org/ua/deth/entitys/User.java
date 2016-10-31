package org.ua.deth.entitys;

import javax.persistence.*;

@Entity(name = "users")
public class User {
    @Id
    @SequenceGenerator(name = "user_id_seq", sequenceName = "user_id_seq", allocationSize = 0)
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id")
    private long userId;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "fk_user_group_id", referencedColumnName = "user_group_id")
    private UserGroup userGroup;


    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}
