package com.board.workBoard.domain.sample.dao;

import com.board.workBoard.domain.sample.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {

    // repository.class(interface), dao.class 구성

    @Query(value = "select * from Sample where :#{sample.id}", nativeQuery = true)
    void saveSample(Sample sample);
}
