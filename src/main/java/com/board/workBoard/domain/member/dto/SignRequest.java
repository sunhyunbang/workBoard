package com.board.workBoard.domain.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "회원 Request")
public class SignRequest {

    @Schema(description = " 회원 번호", hidden = true)
    private Long id;

    @Schema(description = "회원 ID", example = "test")
    private String account;

    @Schema(description = "회원 PASSWORD", example = "****")
    private String password;

    @Schema(description = "회원 닉네임", example = "개발1팀")
    private String nickname;

    @Schema(description = "회원 이름", example = "홍길동")
    private String name;

    @Schema(description = "회원 이메일", example = "test@mediawill.com")
    private String email;

}
