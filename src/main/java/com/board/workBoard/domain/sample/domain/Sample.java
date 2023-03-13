package com.board.workBoard.domain.sample.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity // Entity name
@Table(name ="SAMPLE_TB") // database table name
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Sample {
    // entity.class 구성

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "USER_EMAIL", nullable = false)
    private String userEmail;

    @Column(name = "USER_PW", nullable = false)
    private String userPw;

    @Column(name = "USER_NM", nullable = false)
    private String userNm;

    @Column(name = "USER_TEL", nullable = true)
    private String userTel;

    @Column(name = "USE_YN", nullable = false)
    private String useYn;
//    @Column(name = "ROLE")
//    private String role;

}
