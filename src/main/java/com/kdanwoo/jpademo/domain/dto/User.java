package com.kdanwoo.jpademo.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private String name;
    private Long age;
    private String email;

    /// Main.java
    public static void main(String[] args) {
        User user = new User();
        user.setName("testname");
        user.setEmail("test@test.com");

        /// age가 설정되지 않았으므로 user는 완전하지 않은 객체
    }
}

