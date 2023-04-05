package com.board.workBoard.domain.sample.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="sample_tb") // database table name
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String pw;

    private String name;

    private String tel;

}
