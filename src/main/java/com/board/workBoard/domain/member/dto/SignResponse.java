package com.board.workBoard.domain.member.dto;

import com.board.workBoard.domain.member.domain.Authority;
import com.board.workBoard.domain.member.domain.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "회원 Response")
public class SignResponse {

    @Schema(description = " 회원 번호")
    private Long id;

    @Schema(description = "회원 ID", example = "test")
    private String account;

    @Schema(description = "회원 닉네임", example = "개발1팀")
    private String nickname;

    @Schema(description = "회원 이름", example = "홍길동")
    private String name;

    @Schema(description = "회원 이메일", example = "test@mediawill.com")
    private String email;

    @Schema(description = "회원 권한", hidden = true)
    private List<Authority> roles = new ArrayList<>();

    @Schema(hidden = true)
    private String token;

    public SignResponse(Member member) {
        this.id = member.getId();
        this.account = member.getAccount();
        this.nickname = member.getNickname();
        this.name = member.getName();
        this.email = member.getEmail();
        this.roles = member.getRoles();
    }
}
