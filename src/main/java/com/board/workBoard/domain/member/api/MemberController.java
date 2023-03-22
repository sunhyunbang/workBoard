package com.board.workBoard.domain.member.api;

import com.board.workBoard.domain.member.application.MemberService;
import com.board.workBoard.domain.member.dao.MemberRepository;
import com.board.workBoard.domain.member.dto.SignRequest;
import com.board.workBoard.domain.member.dto.SignResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Tag(name = "Member", description = "회원 API")
public class MemberController {

    private final MemberService memberService;

    @Operation(summary = "회원 로그인", description = "회원 아이디와 패스워드를 통해 로그인 한다.")
    @PostMapping("/login")
    public ResponseEntity<SignResponse> signin(
            @RequestBody SignRequest request) throws Exception {
        return new ResponseEntity<>(memberService.login(request), HttpStatus.OK);
    }
    //    public ResponseEntity<SignResponse> signin(
//            @Parameter()
//            @RequestParam(value = "account") String account,
//            @RequestParam(value = "password") String password,
//            @Parameter(hidden = true) SignRequest request
//            ) throws Exception {
//        request.setAccount(account);
//        request.setPassword(password);
//        return new ResponseEntity<>(memberService.login(request), HttpStatus.OK);
//    }

    @Operation(summary = "회원가입", description = "회원 가입을 한다.")
    @PostMapping("/register")
    public ResponseEntity<Boolean> signup(@RequestBody SignRequest request) throws Exception {
        return new ResponseEntity<>(memberService.register(request), HttpStatus.OK);
    }

    @Operation(summary = "회원 정보 조회", description = "회원 정보를 조회한다.")
    @GetMapping("/user/get")
    public ResponseEntity<SignResponse> getUser(
            @Parameter(name = "account", description = "회원 아이디") String account) throws Exception {
        return new ResponseEntity<>(memberService.getMember(account), HttpStatus.OK);
    }

    @Operation(summary = "관리자 정보 조회", description = "관리자 정보를 조회한다.")
    @GetMapping("/admin/get")
    public ResponseEntity<SignResponse> getUserForAdmin(
            @Parameter(name = "account", description = "관리자 아이디") String account) throws Exception {
        return new ResponseEntity<>(memberService.getMember(account), HttpStatus.OK);
    }
}
