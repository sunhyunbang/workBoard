package com.board.workBoard.domain.member.dao;

import com.board.workBoard.domain.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByAccount(String account);
}
