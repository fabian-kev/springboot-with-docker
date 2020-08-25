package com.fbiankevin.user.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private Name name;
    private String mobile;
    private String email;
    private Date createDate;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Name {
        private String firstName;
        private String lastName;
    }
}
