package com.board.workBoard.domain.sample.board.Dto;

import com.board.workBoard.domain.sample.board.Entity.Board;
import lombok.Getter;

@Getter
public class BoardResponseDto {
   private Long id;
  private String title;
  private String content;
  private int readCnt;
  private String registerId;

  public BoardResponseDto(Board entity){
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.content = getContent();
    this.readCnt = getReadCnt();
    this.registerId = getRegisterId();
  }

  public Board ToEntity(){
    return Board.builder()
            .title(this.title)
            .content(this.content)
            .readCnt(this.readCnt)
            .registerId(this.registerId)
            .build();
  }
}
