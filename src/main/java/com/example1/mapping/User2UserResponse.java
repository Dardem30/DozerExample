package com.example1.mapping;

import com.example1.domain.User;
import com.example1.dto.UserResponse;
import com.example1.dto.UsersResponse;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingOption;
import org.dozer.loader.api.TypeMappingOptions;

import java.util.Set;

import static org.dozer.loader.api.FieldsMappingOptions.hintA;
import static org.dozer.loader.api.FieldsMappingOptions.hintB;

/**
 * Created by Роман on 14.10.2017.
 */
public class User2UserResponse extends BeanMappingBuilder {
    @Override
    protected void configure() {
        mapping(Set.class, UsersResponse.class, TypeMappingOptions.oneWay())
                .fields(this_(),"users",hintA(User.class),hintB(UserResponse.class));
    }
}
