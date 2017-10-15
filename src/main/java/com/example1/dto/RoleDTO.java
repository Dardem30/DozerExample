package com.example1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Роман on 15.10.2017.
 */
@Data
@JsonTypeName(value = "")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
public class RoleDTO implements Serializable{
    private static final int serialVersionUID=2002;
    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
}
