package com.board.workBoard.domain.sample.board.Controller;

import com.board.workBoard.domain.sample.board.Dto.BoardRequestDto;
import com.board.workBoard.domain.sample.board.Dto.BoardResponseDto;
import com.board.workBoard.domain.sample.board.Service.BoardService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class BoardSampleController {
  private BoardService boardService;

  @GetMapping("/api/sample/boardList")
  public HashMap<String , Object> getBoardList(@RequestParam(defaultValue = "0" ,required = false) int page
          , @RequestParam(defaultValue = "5" , required = false) int size
          , Model model) throws Exception {
    HashMap<String, Object> resultMap = null;
    try {
      resultMap = boardService.findAll(page, size);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return resultMap;
  }

  @PostMapping("/api/sample/saveBoard")
  public void saveBoard(BoardRequestDto boardRequestDto) throws Exception {
    boardService.boardSave(boardRequestDto);
  }
}
