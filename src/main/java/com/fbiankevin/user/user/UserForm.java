package com.fbiankevin.user.user;

import lombok.Data;

@Data
public class UserForm {
    private Long id;
    private Name name;
    private String mobile;
    private String email;
    @Data
    public static class Name {
        private String firstName;
        private String lastName;
    }
}
