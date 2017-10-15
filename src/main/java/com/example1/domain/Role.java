package com.example1.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Роман on 14.10.2017.
 */
@Entity
@Data
@NoArgsConstructor
@Table(name="role")
public class Role implements Persistable<Integer> {
    private static final int serialVersionUID=1010;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
//    @JsonIgnore
    @ManyToMany
    @JoinTable(name ="role_user",joinColumns = @JoinColumn(name = "role_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return Objects.nonNull(id);
    }
}
