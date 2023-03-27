<script setup>
import {ref, computed} from 'vue'
import {useStore} from 'vuex'
import router from "@/router"

const store = useStore()

// const acc = store.state.auth.account

// const sample = await store.dispatch("auth/getSample")
let userId = ref("")
let userPw = ref("")

const login = async () => {
  try {
    if (!!!userId.value) {
      alert("아이디를 입력해주세요.")
      return
    }
    if (!!!userPw.value) {
      alert("비밀번호를 입력해주세요.")
      return
    }

    const payload = {
      account : userId.value,
      password : userPw.value
    }
    await store.dispatch("auth/login", payload)
    // 로그인 성공 시 메인화면으로 이동
    await router.push("/")
  } catch (e) {
    alert(e.response.data)
  }
}

const logout = () => {
  try {
    store.dispatch("auth/logout")
  } catch (e) {
    console.log(e.response.data)
  }
}

const getUser = async () => {
  try {
    const acc = 'test123'
    const user = await store.dispatch("auth/getUser", acc)
    console.log("유저 조회 => ", user)
  } catch (e) {
    console.log(e.response.data)
  }
}

const getAdmin = async () => {
  try {
    const acc = 'test123'
    const user = await store.dispatch("auth/getAdmin", acc)
    console.log("관리자 조회 => ", user)
  } catch (e) {
    console.log(e.response.data)
  }
}
</script>

<template>
  <!--  <body class="login">-->
  <div class="login">
    <div class="wrap_login">
      <h1 class="tit">파인드올 관리자 로그인</h1>
      <div class="inner">
        <div class="inp">
          <input type="text" v-model="userId"
                 maxlength="30" class="inp_txt"
                 placeholder="아이디">
        </div>
        <div class="inp">
          <input type="password" v-model="userPw"
                 maxlength="30" class="inp_txt" placeholder="비밀번호">
        </div>
        <div class="box_btn">
          <input type="button" value="로그인" class="btn"
                 @click="login"
                 @keyup.enter="submit"
          />
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
              <input type="button" value="계정 신청하기"
                     style="line-height:150%;width:100%;height:45px;background-color:#808080;font-weight:bold;font-size:16px;color:#fff;"/>
            </td>
          </tr>
        </table>
        <input type="button" value="관리자 정보 조회" @click="getUser"/>
        <input type="button" value="회원 정보 조회" @click="getAdmin" style="margin-left: 10px"/>
        <input type="button" value="로그아웃" @click="logout()" style="margin-left: 10px"/>
      </div>
    </div>
  </div>
  <!--  </body>-->
</template>
