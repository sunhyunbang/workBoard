<script setup>
import Header from "@/components/Header/Header";
import Regist from "@/views/Board2/BoardRegist";
</script>

<template>
  <Header/>
  <div id="cMain">
    <div id="mNav" class="fxd">
      <div class="article_nav">
        <h2 class="tit_header">부동산써브 업무요청</h2>
        <div class="navigate">
          <a href="#">Home</a><span class="txt_arr">&gt;</span><a href="#">부동산써브 업무요청</a><span class="txt_arr">&gt;</span><strong>게시글 자세히보기</strong>
        </div>
      </div>
    </div>
    <div id="mSub" class="scrollY">
      <div class="article_search">
        <form name="frmEnt" method="get">


          <input type="hidden" name="BoardIDX" value="5" id="BoardIDX">
          <input type="hidden" name="page" value="1">
          <input type="hidden" name="totcnt" value="0">
          <input type="hidden" name="stat" value="">
          <input type="hidden" name="assignname" value="">
          <input type="hidden" name="sltcode" value="1" checked="checked">
          <h3 class="screen_out">게시판 검색</h3>
          <div class="section_search">
            <div class="wrap_search">
              <input type="hidden" name="sltSearchKind" value="123"><!-- 키워드 작성자,제목,내용 으로 기본 검색 -->
              <input type="search" name="strSearchKeyword" value="" placeholder="검색어를 입력하세요. (작성자, 제목, 내용, 게시글번호)" id="keyword" class="inp_search" onkeyup="">
              <input type="button" id="strSearchKeyword" value="검색" class="ico_comm btn_search" onclick="">
            </div>
            <div class="wrap_search_list"> <!-- 검색결과/페이지 새로고침치리하면 필요없음 -->
              <ul class="list_search">
                <li><a href="">김써브</a></li>
                <li><a href="">김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브김써브</a></li>
              </ul>
            </div>
          </div>
        </form>
      </div>
      <div class="article_list">
        <h3 class="screen_out">게시판 리스트</h3>
        <div class="section_list">
          <div class="wrap_tab">
            <ul class="list_tab" id="list_tab">

              <li class="on"><button type="button" onclick=""><span class="txt">ALL</span><span class="num">40</span></button></li>

              <li><button type="button" onclick=""><span class="txt">MY</span><span class="num">0</span></button></li>
              <li><button type="button" onclick=""><span class="txt">OPEN</span><span class="num">38</span></button></li>
              <li><button type="button" onclick=""><span class="txt">CLOSED</span><span class="num">2</span></button></li>

            </ul>


            <div class="box_sort">
              <div class="select select_type3">
                <div class="box_btn">
                  <button id="btn_select" class="btn_select" onclick=""><span>+1개 선택됨</span></button>
                </div>
                <div id="sortCate" class="option" style="width:314px;">
                  <ul class="list_option" style="display:inline;">
                    <li><label for="sortCate"><span class="txt" style="font-weight:bold;">상위분류</span></label></li><li style="padding-left:17px;"><label for="sortCate"><span class="txt" style="font-weight:bold;">하위분류</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="10"><span class="txt"> 정책문의</span></label></li><li><label for="sortCate6" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate6" name="sltcode" value="6" class="inp_check sortCate1 1depth_10"><span class="txt"> 네이버 정책관련</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate11"><input type="checkbox" id="sortCate11" name="sltcode" value="11" class="inp_check sortCate1 1depth_10" title="10"><span class="txt"> 부동산써브 정책관련</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="20"><span class="txt"> 건의사항</span></label></li><li><label for="sortCate5" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate5" name="sltcode" value="5" class="inp_check sortCate1 1depth_20"><span class="txt"> 기능개선요청</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="30"><span class="txt"> 계약관리</span></label></li><li><label for="sortCate10" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate10" name="sltcode" value="10" class="inp_check sortCate1 1depth_30"><span class="txt"> 프로모션</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate9"><input type="checkbox" id="sortCate9" name="sltcode" value="9" class="inp_check sortCate1 1depth_30" title="30"><span class="txt"> 승인/수정요청</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="40" checked="checked"><span class="txt"> 오류</span></label></li><li><label for="sortCate2" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate2" name="sltcode" value="2" class="inp_check sortCate1 1depth_40"><span class="txt"> 오류(써브매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate1"><input type="checkbox" id="sortCate1" name="sltcode" value="1" class="inp_check sortCate1 1depth_40" title="40" checked="checked"><span class="txt"> 오류(확인매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate8"><input type="checkbox" id="sortCate8" name="sltcode" value="8" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 오류(다방매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate3"><input type="checkbox" id="sortCate3" name="sltcode" value="3" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 오류(계약관리)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate7"><input type="checkbox" id="sortCate7" name="sltcode" value="7" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 검증이슈</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="50"><span class="txt"> 단지관리</span></label></li><li><label for="sortCate4" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate4" name="sltcode" value="4" class="inp_check sortCate1 1depth_50"><span class="txt"> 단지관리</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="60"><span class="txt"> 기타</span></label></li><li><label for="sortCate12" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate12" name="sltcode" value="12" class="inp_check sortCate1 1depth_60"><span class="txt"> RETS관련</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate13"><input type="checkbox" id="sortCate13" name="sltcode" value="13" class="inp_check sortCate1 1depth_60" title="60"><span class="txt"> 조직/담당자변경</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate99"><input type="checkbox" id="sortCate99" name="sltcode" value="99" class="inp_check sortCate1 1depth_60" title="60"><span class="txt"> 기타</span></label></li><div style="padding-bottom:5px;"></div>
                  </ul>
                  <div class="btn">
                    <button type="button" id="btn_all1" class="btn_all" style="display:none;" onclick=""><span>전체 선택</span></button>
                    <button type="button" id="btn_all2" class="btn_all" style="display:block;" onclick=""><span>선택 해제</span></button>
                    <button type="button" class="btn_apply" onclick=""><span>적용</span></button>
                  </div>
                </div>
              </div>

              <label for="myteamCheck" class="lab_check lab_on"><input type="checkbox" class="inp_check" id="myteamCheck" onclick=""><span class="ico_comm ico_check"></span><span class="txt">MY TEAM</span></label>

            </div>

            <div class="box_btn">
              <a href="#" onclick=""><span class="ico_comm ico_write"></span>게시글 작성</a>
            </div>

          </div>
          <div class="wrap_list" id="boardList">
            <ul class="list_type list_check">

              <li id="idx_250" class="on">
                <a href="#" onclick="">

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#250</em>
										<strong>확인 매물 오류</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
                  <span class="info">
										<span class="txt">[@대구_테스트 : 2020-03-23 오후 1:38:26] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_113">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#113</em>
										<strong>후왕</strong>

											<span class="tag tag_manage">처리중</span>

									</span>
                  <span class="info">
										<span class="txt">[@김선호 : 2018-06-07 오후 5:26:33] →김선호</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_93">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#93</em>
										<strong>오류확인~~~!!!!!</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
                  <span class="info">
										<span class="txt">[@김선호 : 2018-05-02 오후 5:03:53] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_57">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#57</em>
										<strong>1</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
                  <span class="info">
										<span class="txt">[@김선호 : 2018-01-15 오전 11:20:47] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_55">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#55</em>
										<strong>글쓰기53</strong>

											<span class="tag tag_manage">처리중</span>

									</span>
                  <span class="info">
										<span class="txt">[@김선호 : 2018-01-09 오후 12:19:10] →김선호</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">4</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_54" class="done">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#54</em>
										<strong>test</strong>

											<span class="tag tag_complete">이슈종료</span>

									</span>
                  <span class="info">
										<span class="txt">[@오병욱 : 2018-01-08 오후 6:52:10] →오병욱</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">8</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_50">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#50</em>
										<strong>껄껄</strong>

											<span class="tag tag_manage">처리중</span>

									</span>
                  <span class="info">
										<span class="txt">[@강희정 : 2018-01-08 오후 12:07:26] →김선호</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">11</span>

											</span>
										</span>

									</span>
                </a>
              </li>

              <li id="idx_49">
                <a href="#" onclick="">
                  <!--span class=""></span-->

                  <span class="tit">
										<span class="cate">
										오류(확인매물)
										</span>
										<em>#49</em>
										<strong>ㄹㄹ</strong>

											<span class="tag tag_manage">처리중</span>

									</span>
                  <span class="info">
										<span class="txt">[@김선호 : 2018-01-08 오전 10:58:20] →권준호</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">2</span>

											</span>
										</span>

									</span>
                </a>
              </li>

            </ul>
            <div class="paging_comm">
              <a class="btn_comm btn_prev">이전</a>
              <span>1</span>
              <a href="?Page=2&amp;Write=Y&amp;BoardIDX=5&amp;totcnt=40">2</a>
              <a href="?Page=3&amp;Write=Y&amp;BoardIDX=5&amp;totcnt=40">3</a>
              <a href="?Page=4&amp;Write=Y&amp;BoardIDX=5&amp;totcnt=40">4</a>
              <a href="?Page=5&amp;Write=Y&amp;BoardIDX=5&amp;totcnt=40">5</a>
              <a class="btn_comm btn_next">다음</a>
            </div>

          </div>
        </div>
      </div>
    </div>
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
                <Regist />

              </div>
            </fieldset>
          </form>
        </div>
      </div>

      <iframe name="F_ACTION" width="0" height="0" style="display:none"></iframe>

    </div>
  </div>
</template>


<style scoped>
@import '@/assets/board.css';
</style>
