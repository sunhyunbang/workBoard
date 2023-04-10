package com.board.workBoard.domain.board.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="board_code_tb") // database table name
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardCode {
    @Id
    private Long id;

    @Column()
    private String account;

    private String password;

    private String nickname;

    private String name;

    @Column()
    private String email;

}
