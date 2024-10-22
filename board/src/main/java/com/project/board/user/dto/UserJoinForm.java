package com.project.board.user.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserJoinForm {

    @NotBlank(message = "아이디는 필수 정보입니다.")
    @Size(min = 5, max = 20, message = "아이디는 5~15자 사용해 주세요.")
    @Pattern(regexp = "^(?=.*[a-zA-Z0-9])[a-zA-Z0-9_]+$", message = "아이디는 영문, 숫자, 특수문자(_)만 사용 가능합니다.")
    private String userId;

    @NotBlank(message = "비밀번호는 필수 정보입니다.")
    @Size(min = 8, max = 30, message = "비밀번호는 8~30자 사용해 주세요.")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+={}:;\"'<>,.?/~`-])[a-zA-Z0-9!@#$%^&*()_+={}:;\"'<>,.?/~`-]{8,30}$")
    private String userPwd;

    @NotBlank(message = "이름은 필수 정보입니다.")
    @Size(min = 1, max = 10, message = "이름은 10자 이내로 작성해 주세요. ")
    @Pattern(regexp = "^[가-힣]|[a-z]|[A-Z]+$", message = "한글, 영문 대/소문자 사용해 주세요.")
    private String userName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "생년월일은 필수 정보입니다.")
    @Past(message = "생년월일이 정확한지 확인해 주세요.")
    private LocalDateTime birthday;

    @NotBlank(message = "이메일은 필수 정보입니다.")
    @Size(max = 40, message = "올바른 이메일 형식인지 확인해 주세요.")
    @Pattern(
            regexp = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",
            message = "유효한 이메일 주소를 입력해주세요."
    )
    private String email;

}
