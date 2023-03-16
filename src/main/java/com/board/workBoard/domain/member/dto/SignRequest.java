package com.board.workBoard.domain.member.dto;

import lombok.Data;

@Data
public class SignRequest {

    private Long id;

    private String account;

    private String password;

    private String nickname;

    private String name;

    private String email;

}
