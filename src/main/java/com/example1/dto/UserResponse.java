package com.example1.dto;

import com.example1.domain.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Роман on 14.10.2017.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse implements Serializable {
    private static final int serialVersionUID=1001;
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String lastname;
    @JsonProperty
    private String username;
    @JsonProperty
    private String password;
    @JsonProperty
    private String photo;
    @JsonProperty
    private RoleResponse roles;
}
