package com.board.workBoard.domain.sample.board.Repository;

import com.board.workBoard.domain.sample.board.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

public interface BoardRepository extends JpaRepository<Board , Long> {

}
