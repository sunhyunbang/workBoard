package com.board.workBoard.domain.sample.board.Dto;

import com.board.workBoard.domain.sample.board.Entity.BoardSample;
import lombok.Getter;

@Getter
public class BoardSampleResponseDto {

  private Long id;
  private String title;
  private String content;
  private int readCnt;
  private String registerId;

  public BoardSampleResponseDto(BoardSample entity){
    this.id = entity.getId();
    this.title = entity.getTitle();
    this.content = entity.getContent();
    this.readCnt = entity.getReadCnt();
    this.registerId = entity.getRegisterId();
  }

}
