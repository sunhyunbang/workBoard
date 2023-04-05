package com.board.workBoard.domain.sample.api;

import com.board.workBoard.domain.sample.domain.Sample;
import com.board.workBoard.domain.sample.dto.SampleDto;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    // controller.class 구성
    // RestController 만 취급 => @RestController O | @Controller X

    @GetMapping("/api/getSample")
    public Object getSampleData(String name) {
        Sample sample = new Sample();

        if (name.equals("박종섭")) {
            sample = Sample.builder()
                    .email("jsongeop@mediawill.com")
                    .pw("pjs1234")
                    .name("박종섭")
                    .tel("010-0000-0000")
                    .build();
        } else {
            sample = Sample.builder()
                    .email("test@mediawill.com")
                    .pw("test1234")
                    .name("테스트")
                    .tel("010-0000-0000")
                    .build();
        }

        return sample;
    }

    @PostMapping("/api/postSample")
    public Object postSampleData(@RequestBody String name) {
        Sample sample = new Sample();

        if (name.equals("박종섭")) {
            sample = Sample.builder()
                    .email("jsongeop@mediawill.com")
                    .pw("pjs1234")
                    .name("박종섭")
                    .tel("010-0000-0000")
                    .build();
        } else {
            sample = Sample.builder()
                    .email("test@mediawill.com")
                    .pw("test1234")
                    .name("테스트")
                    .tel("010-0000-0000")
                    .build();
        }

        return sample;
    }
}
