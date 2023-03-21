package com.board.workBoard.domain.sample.board.Dto;

import com.board.workBoard.domain.sample.board.Entity.BoardSample;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardSampleRequestDto {

  private Long id;
  private String title;
  private String content;
  private String registerId;

  public BoardSample ToEntity(){
    return BoardSample.builder()
            .title(title)
            .content(content)
            .registerId(registerId)
            .build();
  }
}
