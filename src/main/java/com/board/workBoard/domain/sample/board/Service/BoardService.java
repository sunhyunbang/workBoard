package com.board.workBoard.domain.sample.board.Service;

import com.board.workBoard.domain.sample.board.Dto.BoardRequestDto;
import com.board.workBoard.domain.sample.board.Dto.BoardResponseDto;
import com.board.workBoard.domain.sample.board.Entity.Board;
import com.board.workBoard.domain.sample.board.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {

  private BoardRepository boardRepository;

  @Transactional
  public HashMap<String , Object> findAll(Integer page , Integer size)throws Exception{


    HashMap<String , Object> resultMap = new HashMap<String , Object>();
    Page<Board> list =  boardRepository.findAll(PageRequest.of(size , page , Sort.by(Sort.Direction.DESC , "id")));

    resultMap.put("list" , list.stream().map(BoardResponseDto::new).collect(Collectors.toList()));
    resultMap.put("page" , list.getPageable());
    resultMap.put("size", list.getSize());
    resultMap.put("totalPage", list.getTotalPages());
    resultMap.put("totalCnt", list.getTotalElements());

    return resultMap;
  }

  @Transactional
  public void boardSave(BoardRequestDto boardRequestDto)throws Exception{
    boardRepository.save(boardRequestDto.ToEntity());
  }
}
