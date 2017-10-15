package com.example1.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Роман on 12.10.2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name="user")
public class User implements Persistable<Integer>{
    private static final int serialVersionUID=1100;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "photo")
    private String photo;
//    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return Objects.nonNull(id);
    }
}
