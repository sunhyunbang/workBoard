<script setup>
import {ref, computed} from 'vue'
import {useStore} from 'vuex'
import router from "@/router"

const store = useStore()

const member = store.state.auth.member
console.log(member.name)
</script>
<template>
  <div class="wrap">
    <div class="mini_admin">
      <a href="UserMod.asp">계정 정보 수정</a><a href="AdminPwChange.asp">관리자 비번변경</a><input type="button" value="로그아웃" class="button" OnClick="javascript:location.href='adminLogout.asp'">
    </div>
    <div class="wrap_admin_list">
      <h1 class="tit"><strong>{{ member.name }}</strong>님, FA 관리자 접속을 환영합니다!</h1>
      <div class="inner">
        <dl class="list_dl">
          <dt>오늘의 명언</dt>
          <dd><!--<%=strGoodSay%>-->잘하자</dd>
        </dl>
        <h2>{{ member.name }}님 사용 가능 섹션</h2>
        <table class="tbl">
          <colgroup>
            <col width="15%" />
            <col width="46%" />
            <col width="30%" />
            <col width="15%" />
          </colgroup>
          <thead>
          <tr>
            <th>관리섹션</th>
            <th>관리권한</th>
            <th>마지막 접속 시간</th>
            <th>관리자접속</th>
          </tr>
          </thead>
          <tbody>

<!--          <%=str%>-->

<!--          <%-->
<!--          's isms 승인 관련 파일업로드 승인관리 20190213, 개발팀만 접근-->
<!--          Dim tempAdminID : tempAdminID = LCase(AdminID)-->
<!--          Dim AccessAuthYN : AccessAuthYN = "N"-->
<!--          If InStr(arrAuthYN_Dev, "," & tempAdminID & "," ) > 0 Then-->
<!--          AccessAuthYN = "Y"-->
<!--          End If-->
<!--          %>-->
<!--          <% If AccessAuthYN = "Y" Then %>-->
          <tr>
            <td>소스배포관리</td>
            <td>소스배포관리</td>
            <td>-</td>
            <td><input type="button" value="접 속" Class="button"  style="line-height:150%;" ></td>
          </tr>
<!--          <%-->
<!--          End If-->
<!--          'e isms 승인 관련 파일업로드 승인관리-->
<!--          %>-->

<!--          <%-->
<!--          '구벼부접근용 201910.16 권한 DB처리-->
<!--          Dim LandAuthYN : LandAuthYN = "N"-->
<!--          If InStr(arrAuthYN_Land, "," & tempAdminID & "," ) > 0 Then-->
<!--          LandAuthYN = "Y"-->
<!--          End If-->
<!--          %>-->
<!--          <% If LandAuthYN = "Y" Then %>-->
          <tr>
            <td>구벼룩시장</td>
            <td>구벼룩시장</td>
            <td>-</td>
            <td><input type="button" value="접 속" Class="button"  style="line-height:150%;"></td>
          </tr>
<!--          <%-->
<!--          End If-->
<!--          '구벼부접근용-->
<!--          %>-->
          </tbody>
        </table>
        <ul class="list_dot">
          <li>* 최종 접속일시 : <!--<%= f_loginDT %>--> </li>
          <li>* 통합ID 접속센터: https://admin.findall.co.kr:444</li>
          <li>* 문의사항 : 080-269-0011 / info@findall.co.kr</li>
        </ul>
      </div>
    </div>
  </div>
</template>
