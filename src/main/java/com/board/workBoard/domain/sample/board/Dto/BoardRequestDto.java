package com.board.workBoard.domain.sample.board.Dto;

import com.board.workBoard.domain.sample.board.Entity.Board;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequestDto {

  private Long id;
  private String title;
  private String content;
  private int readCnt;
  private String registerId;

  public Board ToEntity(){
    return Board.builder()
            .title(this.title)
            .content(this.content)
            .readCnt(this.readCnt)
            .registerId(this.registerId)
            .build();
  }
}
