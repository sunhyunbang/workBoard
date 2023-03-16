<template>
<!--  <body class="login">-->
  <div class="login">
    <div class="wrap_login">
      <h1 class="tit">파인드올 관리자 로그인</h1>
      <div class="inner">
        <div class="inp"><label for="userId" class="lab"></label><input TabIndex="2" type="text" id="userId" name="userId" size="16" maxlength="30" class="inp_txt" placeholder="아이디"></div>
        <div class="inp"><label for="userPw" class="lab"></label><input TabIndex="3" type="password" id="userPw" name="userPw" size="16" maxlength="30" class="inp_txt" placeholder="비밀번호"></div>
<!--        <div class="inp"><label for="txtAdminPassword" class="lab">비밀번호</label><input TabIndex="3" type="password" id="txtAdminPassword" name="txtAdminPassword" size="16" maxlength="30" class="inp_txt" onkeypress="fn_EnterKey();"></div>-->
        <div class="box_btn">
          <input TabIndex="4" type="button" value="로그인" border="0"  id="image1" name="image1" class="btn"/>
<!--          <input TabIndex="4" type="button" value="로그인" border="0"  id="image1" name="image1" class="btn" Onclick="javascript:login();" />-->
        </div>
        <table width="100%">
          <tr>
            <td>
              <ul class="list_dot">
                <li>* 통합ID 접속센터: https://admin.findall.co.kr:444</li>
                <li>* 문의사항 : 080-269-0011 / info@findall.co.kr</li>
                <li>* 관리자 계정 문의 : mwsupport@mediawill.com</li>
              </ul>
            </td>
            <td align="center">
<!--              <input type="button" value="계정 신청하기" style="line-height:150%;width:100%;height:45px;background-color:#808080;font-weight:bold;font-size:16px;color:#fff;" Onclick="javascript:location.href='/Apply/ApplyReg.asp';" />-->
              <input type="button" value="계정 신청하기" style="line-height:150%;width:100%;height:45px;background-color:#808080;font-weight:bold;font-size:16px;color:#fff;"/>
            </td>
          </tr>
        </table>

      </div>
    </div>
  </div>
<!--  </body>-->
</template>

<script>
export default {
  name: "Login",
}
</script>