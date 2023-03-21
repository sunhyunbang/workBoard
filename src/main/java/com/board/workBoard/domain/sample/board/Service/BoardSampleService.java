package com.board.workBoard.domain.sample.board.Service;

import com.board.workBoard.domain.sample.board.Dto.BoardSampleRequestDto;
import com.board.workBoard.domain.sample.board.Dto.BoardSampleResponseDto;
import com.board.workBoard.domain.sample.board.Entity.BoardSample;
import com.board.workBoard.domain.sample.board.Repository.BoardSampleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class BoardSampleService {

  private final BoardSampleRepository boardSampleRepository;

  @Transactional
  public HashMap<String , Object> findAll(Integer page , Integer size)throws Exception{

    Page<BoardSample> list =  boardSampleRepository.findAll(PageRequest.of(page, size , Sort.by(Sort.Direction.DESC , "id")));

    HashMap<String , Object> resultMap = new HashMap<String , Object>();
    resultMap.put("list", list.stream().map(BoardSampleResponseDto::new).collect(Collectors.toList()));
    resultMap.put("page" , list.getPageable());
    resultMap.put("size", list.getSize());
    resultMap.put("totalPage", list.getTotalPages());
    resultMap.put("totalCnt", list.getTotalElements());

    return resultMap;
  }

  @Transactional
  public void boardSave(BoardSampleRequestDto boardSampleRequestDto)throws Exception{

    boardSampleRepository.save(boardSampleRequestDto.ToEntity());
  }
}
