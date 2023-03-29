<script setup>
import {ref} from 'vue';
import {useStore} from "vuex";

const store = useStore();

let userName = JSON.parse(localStorage.getItem("member"))
// console.log("userName1 : " + localStorage.getItem("member"))
// console.log("userName2 : " + JSON.parse(userName).name)

// let userName = ref('click');

// const getUser = async () =>{
//   try{
//     store.dispatch("auth/getUser","snhyun82")
//         .then((res) =>{
//           console.log(res.data);
//
//           userName = res.data;
//         })
//   }catch (e) {
//
//   }
// }


</script>
<template>
  <div id="header">
    <div class="header">
      <h1 id="logo"><a href="#"><img src="" width="48" alt=""></a></h1>
      <h2 class="admin_tit">MEDIAWILL</h2>
    </div>
    <div id="nav">
      <ul class="list_gnb">

        <li id="list_gnb_1_5" class="on"><a href="MyList.asp?BoardIdx=1,5">MY</a></li><!-- 통합 처리 1,5 -->
        <li id="list_gnb_5"><a href="List.asp?BoardIdx=5">부동산써브 업무요청</a></li>
        <li id="list_gnb_1"><a href="List.asp?BoardIdx=1">벼룩시장 업무요청</a></li>

        <li id="list_gnb_6"><a href="List.asp?BoardIdx=6">공지사항</a></li>

      </ul>
    </div>
    <div id="MiniServe">
      <ul class="list_mini_serve">
        <li>
          <div class="box_btn">
            <button type="button" class="btn_alarm"><span class="txt">{{ userName.name }}</span></button>
          </div>
        </li>
        <li>
          <a href="/AdminLogout.asp" class="btn_login"><span class="txt">로그아웃</span></a>
        </li>
        <li>
          <a href="Template.asp?BoardIDX=5" class="btn_login" target="_blank"><span class="txt">템플릿 등록</span></a>
        </li>
        <li>
          <a href="manager.asp" class="btn_login" target="_blank"><span class="txt">담당자 등록</span></a>
        </li>
        <li>
          <a href="manager_auth.asp" class="btn_login" target="_blank"><span class="txt">할당&메일&권한 관리</span></a>
        </li>
        <li>
          <a href="List.asp?BoardIdx=1" class="btn_login"><span class="txt">업무요청게시판</span></a>
        </li>

      </ul>
    </div>
  </div>
</template>


