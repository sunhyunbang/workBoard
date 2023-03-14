<template>
  <body OnLoad="document.AdminLoginForm.txtAdminId.focus();" class="login">
  <form name="AdminLoginForm" method="post" >
    <div class="wrap_login">
      <h1 class="tit">파인드올 관리자 로그인</h1>
      <div class="inner">
        <div class="inp"><label for="txtAdminId" class="lab">아이디</label><input TabIndex="2" type="text" id="txtAdminId" name="txtAdminId" size="16" maxlength="30" class="inp_txt"></div>
        <div class="inp"><label for="txtAdminPassword" class="lab">비밀번호</label><input TabIndex="3" type="password" id="txtAdminPassword" name="txtAdminPassword" size="16" maxlength="30" class="inp_txt" ></div>
<!--        <div class="inp"><label for="txtAdminPassword" class="lab">비밀번호</label><input TabIndex="3" type="password" id="txtAdminPassword" name="txtAdminPassword" size="16" maxlength="30" class="inp_txt" onkeypress="fn_EnterKey();"></div>-->
        <div class="box_btn">
          <input TabIndex="4" type="button" value="로그인" border="0"  id="image1" name="image1" class="btn" Onclick="javascript:login();" />
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
              <input type="button" value="계정 신청하기" style="line-height:150%;width:100%;height:45px;background-color:#808080;font-weight:bold;font-size:16px;color:#fff;" Onclick="javascript:location.href='/Apply/ApplyReg.asp';" />
            </td>
          </tr>
        </table>

      </div>
    </div>
    <div class="layer-pop" style="display:none;">
      <dl class="layer-contents">
        <dt class="layer-title">임시 비밀번호 발급</dt>
        <dd class="layer-body">
          <p class="layer-text">아이디를 입력해 주시면, 계정 정보 내 이메일로 임시 비밀번호가 전달됩니다.</p>
          <input type="text" class="layer-input" id="txtNewPwId" name="txtNewPwId" size="16" maxlength="30" />
        </dd>
        <dd class="layer-bottom">
          <input type="button" class="layer-btn" value="확인" Onclick="javascript:fn_submit();" />
        </dd>
      </dl>
    </div>
  </form>
  </body>
</template>

<script>
export default {
  name: "Login"
}
</script>

<style scoped>

</style>