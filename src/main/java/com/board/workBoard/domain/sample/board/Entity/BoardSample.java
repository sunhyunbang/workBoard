package com.board.workBoard.domain.sample.board.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class BoardSample {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  private String title;
  private String content;
  private int readCnt;
  private String registerId;


  @Builder
  public BoardSample(Long id, String title, String content, int readCnt, String registerId){
    this.id = id;
    this.title = title;
    this.content = content;
    this.readCnt = readCnt;
    this.registerId = registerId;
  }

}
