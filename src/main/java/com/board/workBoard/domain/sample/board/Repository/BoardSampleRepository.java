package com.board.workBoard.domain.sample.board.Repository;

import com.board.workBoard.domain.sample.board.Entity.BoardSample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardSampleRepository extends JpaRepository<BoardSample, Long> {

}
