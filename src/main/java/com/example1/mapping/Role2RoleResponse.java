package com.example1.mapping;

import com.example1.domain.Role;
import com.example1.domain.User;
import com.example1.dto.RoleResponse;
import com.example1.dto.RolesResponse;
import com.example1.dto.UserResponse;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;

import java.util.Set;

import static org.dozer.loader.api.FieldsMappingOptions.hintA;
import static org.dozer.loader.api.FieldsMappingOptions.hintB;

/**
 * Created by Роман on 14.10.2017.
 */
public class Role2RoleResponse extends BeanMappingBuilder {
    @Override
    protected void configure() {
        mapping(Set.class, RolesResponse.class, TypeMappingOptions.oneWay())
                .fields(this_(),"roles",hintA(Role.class),hintB(RoleResponse.class));
    }
}
