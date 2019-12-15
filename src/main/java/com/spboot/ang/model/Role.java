package com.spboot.ang.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    private long id;
    private String role;

    public Role() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
