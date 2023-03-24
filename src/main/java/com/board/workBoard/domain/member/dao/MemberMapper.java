package com.board.workBoard.domain.member.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {
   List <Map<String,String>> getMemberList();
}
