package com.project.board.user.repository;

import com.project.board.user.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Mapper
public interface MybatisUserRepositoryImpl extends UserRepository{

    @Insert("insert into User(userId, userPwd, userName, birthday, email, createdDate " +
            "values(#{userId}, #{userPwd}, #{userName}, #{birthday}, #{email}, current_timestamp)")
    @Options(useGeneratedKeys = true, keyProperty = "userUid")
    User userSave(User user);

    @Select("select * from User where userId = #{userId}")
    Optional<User> findUserById(String id);

    @Select("select * from User where email = #{email}")
    Optional<User> findUserByEmail(String email);

    @Select("select exists(select * from User where userId = ${userId}) as isExists")
    boolean existByUserId(String userId);

    @Select("select exists(select * from User where email = ${email}) as isExists")
    boolean existByUserEmail(String email);
}
