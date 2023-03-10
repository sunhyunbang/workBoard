package com.board.workBoard.domain.sample.dto;

import com.board.workBoard.domain.sample.domain.Sample;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleDto {
    // dto.class 구성

    // @NotNull : 필수 값을 나타내며 null 값으로 넘어올 시 NulPointException 예외 발생
    // @NoArgsConstructor(AccessLevel.PROTECTED) 기본 생성자 호출을 방지
    private Long id;
    private String name;
    private Integer age;

    @Builder
    public Sample toEntity() {
        return Sample.builder()
                .id(id)
                .name(name)
                .age(age)
                .build();
    }
}
