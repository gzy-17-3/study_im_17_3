package com.gzy.im.model;


import javax.persistence.*;

@Entity
@Table(name = "accounts",uniqueConstraints = {@UniqueConstraint(columnNames="email")})
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String email;
    @Column(length = 20)
    private String username;
    @Column(length = 32)
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
