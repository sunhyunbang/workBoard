package com.board.workBoard.domain.member.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "회원 Request")
public class SignRequest {

    @Schema(description = " 회원 번호", hidden = true)
    private Long id;

    @Schema(description = "회원 Id")
    private String account;

    @Schema(description = "회원 Password")
    private String password;

    @Schema(description = "회원 닉네임")
    private String nickname;

    @Schema(description = "회원 이름")
    private String name;

    @Schema(description = "회원 이메일")
    private String email;

    @Schema(description = "임시 권한")
    private boolean role;

}
