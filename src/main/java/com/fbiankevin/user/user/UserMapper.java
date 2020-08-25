package com.fbiankevin.user.user;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    UserEntity toEntity(UserForm form);

    User toModel(UserEntity entity);
}
