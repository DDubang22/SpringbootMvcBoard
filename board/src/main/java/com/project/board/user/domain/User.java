package com.project.board.user.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long userUid; // Unique identifier
    private String userId;
    private String userPwd;
    private String userName;
    private LocalDateTime birthday;
    private String email;
    private LocalDateTime createdDate;
    private String bio; // biographical profile

}
