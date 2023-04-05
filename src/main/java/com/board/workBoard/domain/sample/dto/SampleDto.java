package com.board.workBoard.domain.sample.dto;

import com.board.workBoard.domain.sample.domain.Sample;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "샘플 DTO")
public class SampleDto {
    // dto.class 구성

    // @NotNull : 필수 값을 나타내며 null 값으로 넘어올 시 NulPointException 예외 발생
    // @NoArgsConstructor(AccessLevel.PROTECTED) 기본 생성자 호출을 방지
    @Schema(description = "id", nullable = false, example = "1")
    private Long id;

    @Schema(description = "이메일", nullable = false, example = "")
    private String email;

    @Schema(description = "패스워드", nullable = false, example = "")
    private String pw;

    @Schema(description = "이름", nullable = false, example = "")
    private String name;

    @Schema(description = "전화번호", nullable = true, example = "")
    private String tel;

    @Builder
    public Sample toEntity() {
        return Sample.builder()
                .email(email)
                .pw(pw)
                .name(name)
                .tel(tel)
                .build();
    }
}
