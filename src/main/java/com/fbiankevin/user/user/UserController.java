package com.fbiankevin.user.user;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/users")
@Slf4j
@AllArgsConstructor
public class UserController {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @PostMapping
    User create(@RequestBody UserForm userForm) {

        UserEntity entity = userRepository.save(userMapper.toEntity(userForm));

        return userMapper.toModel( entity );
    }

    @GetMapping
    User getUser() {
        return User.builder()
                .email("user@yopmail.com")
                .createDate(new Date())
                .mobile(UUID.randomUUID().toString())
                .name(User.Name.builder()
                        .firstName("Kevin11111")
                        .lastName("Fabian Handsome")
                        .build()
                ).build();
    }

}
