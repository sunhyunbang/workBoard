package com.board.workBoard.domain.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Sample Controller", description = "샘플 API")
@RequestMapping("/sample")
@RestController
public class BoardController {

    @Operation(summary = "사용자의 정보를 가져옵니다", description = "Get User Info")
    @GetMapping("/get/{id}")
    public String getUser(
            @Parameter(name = "id", description = "아이디", example = "1")
            @PathVariable String id,
            @RequestParam(value = "1", defaultValue = "default", required = false) String queryParam
    ) {
        return "";
    }
}
