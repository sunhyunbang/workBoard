package com.board.workBoard.domain.sample.dto;

import com.board.workBoard.domain.sample.domain.Sample;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Schema(description = "샘플 DTO")
@Data
@Builder
public class SampleDto {
    // dto.class 구성

    // @NotNull : 필수 값을 나타내며 null 값으로 넘어올 시 NulPointException 예외 발생
    // @NoArgsConstructor(AccessLevel.PROTECTED) 기본 생성자 호출을 방지
    @Schema(description = "유저 PK", nullable = false, example = "1")
    private Long pk;

    @Schema(description = "유저 이메일", nullable = false, example = "jsongeop@mediawill.com")
    private String userEmail;

    @Schema(description = "유저 패스워드", nullable = false, example = "****")
    private String userPw;

    @Schema(description = "유저 이름", nullable = false, example = "박종섭")
    private String userNm;

    @Schema(description = "유저 전화번호", nullable = true, example = "010-0000-0000")
    private String userTel;

    @Schema(description = "사용 여부", nullable = false, allowableValues = {"Y", "N"})
    private String useYn;

    @Builder
    public Sample toEntity() {
        return Sample.builder()
                .pk(pk)
                .userEmail(userEmail)
                .userPw(userPw)
                .userNm(userNm)
                .userTel(userTel)
                .useYn(useYn)
                .build();
    }
}
