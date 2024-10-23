package com.project.board.user.repository;

import com.project.board.user.domain.User;

import java.util.Optional;

public interface UserRepository {

    User userSave(User user);

    Optional<User> findUserById(String id);

    Optional<User> findUserByEmail(String email);

    boolean existByUserId(String userId);

    boolean existByUserEmail(String email);

}
