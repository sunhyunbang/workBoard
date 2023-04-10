<script setup>

</script>
<template>

  <div id="mArticle">


    <h2 class="screen_out">게시글 작성</h2>
    <div class="article_write">
      <div class="section_write">
        <form name="frmWrite" method="post" action="write_ok.asp" id="frmWrite">
          <input type="hidden" name="BoardIDX" value="5">
          <input type="hidden" name="idx" value="">
          <input type="hidden" name="page" value="1">
          <input type="hidden" name="totcnt" value="0">
          <input type="hidden" name="sltname" value="">

          <fieldset>
            <div class="wrap_write wrap_write_new">
              <div class="tit">글 등록</div>
              <dl class="subject">
                <dt>제목</dt>
                <dd>
                  <div class="box_select select_script">

                    <!-- 글 작성시 라벨별 템플릿 -->
                    <div style="display:none;" id="CodeTemplate">
                      <textarea id="CodeName1_6">정책문의</textarea><textarea id="CodeName2_6">네이버 정책관련</textarea><textarea id="CodeTemplate_6"></textarea><textarea id="CodeDescription_6">네이버부동산 정책 관련 문의</textarea><textarea id="CodeName1_11">정책문의</textarea><textarea id="CodeName2_11">부동산써브 정책관련</textarea><textarea id="CodeTemplate_11"></textarea><textarea id="CodeDescription_11">부동산써브 정책 관련 문의</textarea><textarea id="CodeName1_5">건의사항</textarea><textarea id="CodeName2_5">기능개선요청</textarea><textarea id="CodeTemplate_5"></textarea><textarea id="CodeDescription_5">웹/모바일 프론트 / 전용창의 기능개선 요청</textarea><textarea id="CodeName1_10">계약관리</textarea><textarea id="CodeName2_10">프로모션</textarea><textarea id="CodeTemplate_10"></textarea><textarea id="CodeDescription_10">월별 상품정책의 적용 요청</textarea><textarea id="CodeName1_9">계약관리</textarea><textarea id="CodeName2_9">승인/수정요청</textarea><textarea id="CodeTemplate_9">과도한 개인정보 등록 금지</textarea><textarea id="CodeDescription_9">부동산써브 광고주회원의 계약정보 및 회원정보 수정 요청</textarea><textarea id="CodeName1_2">오류</textarea><textarea id="CodeName2_2">오류(써브매물)</textarea><textarea id="CodeTemplate_2">회원번호 :
써브매물번호 :
참고링크 :</textarea><textarea id="CodeDescription_2">전용창/프론트의 써브 매물 관련 오류 (베스트/프리미엄/일반 매물 관련)</textarea><textarea id="CodeName1_1">오류</textarea><textarea id="CodeName2_1">오류(확인매물)</textarea><textarea id="CodeTemplate_1">회원번호 :
네이버매물번호 :
써브매물번호 :
참고링크 :</textarea><textarea id="CodeDescription_1">전용창/프론트의 네이버 매물 관련 오류 (써브엔상품 관련)</textarea><textarea id="CodeName1_8">오류</textarea><textarea id="CodeName2_8">오류(다방매물)</textarea><textarea id="CodeTemplate_8">회원번호 :
써브매물번호 :
참고링크 :</textarea><textarea id="CodeDescription_8">전용창/프론트의 다방 매물 관련 오류 (써브디 상품 관련)</textarea><textarea id="CodeName1_3">오류</textarea><textarea id="CodeName2_3">오류(계약관리)</textarea><textarea id="CodeTemplate_3">회원번호 :
계약번호 :
참고링크 :
</textarea><textarea id="CodeDescription_3">어드민 계약관리 및 전용창에서 나타나는 계약 관련 오류</textarea><textarea id="CodeName1_7">오류</textarea><textarea id="CodeName2_7">검증이슈</textarea><textarea id="CodeTemplate_7">회원번호 :
네이버매물번호 :
참고링크 :</textarea><textarea id="CodeDescription_7">전용창 및 네이버에서 나타나는 검증단계의 이슈 확인 요청</textarea><textarea id="CodeName1_4">단지관리</textarea><textarea id="CodeName2_4">단지관리</textarea><textarea id="CodeTemplate_4">단지코드 :
단지명 :
단지주소 :
회원번호 :
요청내용 :
</textarea><textarea id="CodeDescription_4">단지 매핑 및 수정</textarea><textarea id="CodeName1_12">기타</textarea><textarea id="CodeName2_12">RETS관련</textarea><textarea id="CodeTemplate_12"></textarea><textarea id="CodeDescription_12">솔루션 렛츠관련 문의/원격 설치 요청</textarea><textarea id="CodeName1_13">기타</textarea><textarea id="CodeName2_13">조직/담당자변경</textarea><textarea id="CodeTemplate_13">업체명 :
회원번호 :
조직/담당자 :</textarea><textarea id="CodeDescription_13">조직/담당자변경</textarea><textarea id="CodeName1_99">기타</textarea><textarea id="CodeName2_99">기타</textarea><textarea id="CodeTemplate_99"></textarea><textarea id="CodeDescription_99">그 외 기타</textarea>
                    </div>
                    <div class="tit_select"><button type="button" class="btn_comm btn_select_option"><span>선택하세요.</span></button></div>
                    <ul class="list_select" style="width: 220px; display: none;">
                      <li><a href="javascript:selCodeChange();"><span style="color:red;">[정책문의] </span>네이버 정책관련</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[정책문의] </span>부동산써브 정책관련</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[건의사항] </span>기능개선요청</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[계약관리] </span>프로모션</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[계약관리] </span>승인/수정요청</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[오류] </span>오류(써브매물)</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[오류] </span>오류(확인매물)</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[오류] </span>오류(다방매물)</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[오류] </span>오류(계약관리)</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[오류] </span>검증이슈</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[단지관리] </span>단지관리</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[기타] </span>RETS관련</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[기타] </span>조직/담당자변경</a></li><li><a href="javascript:selCodeChange();"><span style="color:red;">[기타] </span>기타</a></li>
                    </ul>
                    <select id="sltcode" name="sltcode">
                      <option value="6">네이버 정책관련</option><option value="11">부동산써브 정책관련</option><option value="5">기능개선요청</option><option value="10">프로모션</option><option value="9">승인/수정요청</option><option value="2">오류(써브매물)</option><option value="1">오류(확인매물)</option><option value="8">오류(다방매물)</option><option value="3">오류(계약관리)</option><option value="7">검증이슈</option><option value="4">단지관리</option><option value="12">RETS관련</option><option value="13">조직/담당자변경</option><option value="99">기타</option><option value="" selected="selected">선택하세요.</option>
                    </select>
                  </div>

                  <div class="inp"><input type="text" name="strtitle" value="" class="inp_txt" placeholder="제목을 입력하세요"></div>
                </dd>
              </dl>
              <dl>
                <dt></dt>
                <dd>
                  <span id="CodeName1" style="color:red;"></span><span id="CodeName2"></span><span id="CodeDescription"></span>
                </dd>
              </dl>

              <dl class="subject">
                <dt>내용</dt>
                <dd>
                  <div class="">
                    <ckeditor :editor="editor" v-model="editorData" :config="editorConfig"></ckeditor>
                    <textarea name="hidStrcontent" id="hidStrcontent" cols="60" rows="10" style="display:none;"></textarea> <!--인코딩 전송 비노출을 위해 -->
                  </div>
                </dd>
              </dl>

              <dl>
                <dt></dt>
                <dd>
                  <span style="color:red;" title="고객의 전화번호 등 개인정보는 절대 입력하지 마세요.">고객의 전화번호 등 개인정보는 절대 입력하지 마세요.</span>
                </dd>
              </dl>

              <div class="box_btn">
                <button type="button" class="btn_cancel" onclick="">취소</button>
                <button type="button" onclick="">등록</button>
              </div>

            </div>
          </fieldset>
        </form>
      </div>
    </div>
    <iframe name="F_ACTION" width="0" height="0" style="display:none"></iframe>

  </div>



</template>
<style scoped>
@import '@/assets/board.css';
</style>

<script>
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import CKEditor from '@ckeditor/ckeditor5-vue';

export default {

  name: "CKEditor",
  components:{
    ckeditor: CKEditor.component
  },
  data: () => ({
    editor: ClassicEditor,
    editorData: '<p>test</p>',
    editorConfig: {

    }

  })

}

</script>

