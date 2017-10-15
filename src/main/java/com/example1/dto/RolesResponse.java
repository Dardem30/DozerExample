package com.example1.dto;

import com.example1.domain.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Set;

/**
 * Created by Роман on 15.10.2017.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RolesResponse {
    @JsonProperty
    Set<RoleResponse> roles;
}
