package com.example1.dto;

import com.example1.domain.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Роман on 14.10.2017.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleResponse implements Serializable {
    private static final int serialVersionUID=1000;
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private Set<UserDTO> users;
}
