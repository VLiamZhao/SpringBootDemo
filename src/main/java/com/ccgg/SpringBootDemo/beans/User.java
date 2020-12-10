package com.ccgg.SpringBootDemo.beans;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ccgg.user")
public class User implements GrantedAuthority {
    private static final long serialVersionUID = 2L;

    @Id
    private int id;
    @Column
    private String name;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
