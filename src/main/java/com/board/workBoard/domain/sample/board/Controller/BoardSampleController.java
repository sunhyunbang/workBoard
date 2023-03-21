package com.board.workBoard.domain.sample.board.Controller;

import com.board.workBoard.domain.sample.board.Dto.BoardSampleRequestDto;
import com.board.workBoard.domain.sample.board.Service.BoardSampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BoardSampleController {

  private final BoardSampleService boardSampleService;

  @GetMapping("/api/sample/boardList")
  public HashMap<String , Object> getBoardList(@RequestParam(defaultValue = "0" ,required = false) int page
          , @RequestParam(defaultValue = "5" , required = false) int size
          , Model model) throws Exception {
    HashMap<String, Object> resultMap = null;
    try {
      resultMap = boardSampleService.findAll(page, size);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return resultMap;
  }

  @GetMapping("/api/sample/boardList1")
  public String getStringBoardList() throws Exception {
    return "vue js";
  }

  @PostMapping("/api/sample/saveBoard")
  public String saveBoard(@RequestBody BoardSampleRequestDto boardSampleRequestDto) throws Exception {
//    log.info("saveBoard77777777777777777 : "+boardSampleRequestDto.getTitle());
//    log.info("saveBoard77777777777777777 : "+boardSampleRequestDto.getContent());
//    log.info("saveBoard77777777777777777 : "+boardSampleRequestDto.getRegisterId());

    boardSampleService.boardSave(boardSampleRequestDto);
    return "save";
  }
}
