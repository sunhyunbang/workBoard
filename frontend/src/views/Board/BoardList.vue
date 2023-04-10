<script setup>
import Header from "@/components/Header/Header";

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
				<input type="hidden" name="sltcode" value="">
				<h3 class="screen_out">게시판 검색</h3>
				<div class="section_search">
					<div class="wrap_search">
						<input type="hidden" name="sltSearchKind" value="123"><!-- 키워드 작성자,제목,내용 으로 기본 검색 -->
						<input type="search" name="strSearchKeyword" value="" placeholder="검색어를 입력하세요. (작성자, 제목, 내용, 게시글번호)" id="keyword" class="inp_search" onkeyup="if(event.keyCode==13)Fn_Search();">
						<input type="button" id="strSearchKeyword" value="검색" class="ico_comm btn_search" onclick="Fn_Search();">
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

							<li class="on"><button type="button" onclick="Fn_Search2('A','');"><span class="txt">ALL</span><span class="num">113</span></button></li>

							<li><button type="button" onclick="Fn_Search2('M','snhyun82');"><span class="txt">MY</span><span class="num">0</span></button></li>
							<li><button type="button" onclick="Fn_Search2('O','snhyun82');"><span class="txt">OPEN</span><span class="num">105</span></button></li>
							<li><button type="button" onclick="Fn_Search2('C','snhyun82');"><span class="txt">CLOSED</span><span class="num">8</span></button></li>

						</ul>


						<div class="box_sort">
							<div class="select select_type3">
								<div class="box_btn">
									<button id="btn_select" class="btn_select" onclick=""><span>+11개 선택됨</span></button>
								</div>
								<div id="sortCate" class="option" style="width:314px;">
									<ul class="list_option" style="display:inline;">
									<li><label for="sortCate"><span class="txt" style="font-weight:bold;">상위분류</span></label></li><li style="padding-left:17px;"><label for="sortCate"><span class="txt" style="font-weight:bold;">하위분류</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="10" checked="checked"><span class="txt"> 정책문의</span></label></li><li><label for="sortCate6" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate6" name="sltcode" value="6" class="inp_check sortCate1 1depth_10"><span class="txt"> 네이버 정책관련</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate11"><input type="checkbox" id="sortCate11" name="sltcode" value="11" class="inp_check sortCate1 1depth_10" title="10"><span class="txt"> 부동산써브 정책관련</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="20" checked="checked"><span class="txt"> 건의사항</span></label></li><li><label for="sortCate5" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate5" name="sltcode" value="5" class="inp_check sortCate1 1depth_20"><span class="txt"> 기능개선요청</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="30"><span class="txt"> 계약관리</span></label></li><li><label for="sortCate10" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate10" name="sltcode" value="10" class="inp_check sortCate1 1depth_30"><span class="txt"> 프로모션</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate9"><input type="checkbox" id="sortCate9" name="sltcode" value="9" class="inp_check sortCate1 1depth_30" title="30"><span class="txt"> 승인/수정요청</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="40" checked="checked"><span class="txt"> 오류</span></label></li><li><label for="sortCate2" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate2" name="sltcode" value="2" class="inp_check sortCate1 1depth_40"><span class="txt"> 오류(써브매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate1"><input type="checkbox" id="sortCate1" name="sltcode" value="1" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 오류(확인매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate8"><input type="checkbox" id="sortCate8" name="sltcode" value="8" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 오류(다방매물)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate3"><input type="checkbox" id="sortCate3" name="sltcode" value="3" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 오류(계약관리)</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate7"><input type="checkbox" id="sortCate7" name="sltcode" value="7" class="inp_check sortCate1 1depth_40" title="40"><span class="txt"> 검증이슈</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="50"><span class="txt"> 단지관리</span></label></li><li><label for="sortCate4" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate4" name="sltcode" value="4" class="inp_check sortCate1 1depth_50"><span class="txt"> 단지관리</span></label></li><div style="padding-bottom:5px;"></div><li><label style="border-top:1px solid #ddd;"><input type="checkbox" class="inp_check sortCate2" value="60" checked="checked"><span class="txt"> 기타</span></label></li><li><label for="sortCate12" style="border-top:1px solid #ddd;"><input type="checkbox" id="sortCate12" name="sltcode" value="12" class="inp_check sortCate1 1depth_60"><span class="txt"> RETS관련</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate13"><input type="checkbox" id="sortCate13" name="sltcode" value="13" class="inp_check sortCate1 1depth_60" title="60"><span class="txt"> 조직/담당자변경</span></label></li><div style="padding-bottom:5px;"></div><li><label><span class="txt" style="width:17px;"></span><span class="txt"></span></label></li><li><label for="sortCate99"><input type="checkbox" id="sortCate99" name="sltcode" value="99" class="inp_check sortCate1 1depth_60" title="60"><span class="txt"> 기타</span></label></li><div style="padding-bottom:5px;"></div>
									</ul>
									<div class="btn">
										<button type="button" id="btn_all1" class="btn_all" style="display:block;" onclick="toggleObj('btn_all1');"><span>전체 선택</span></button>
										<button type="button" id="btn_all2" class="btn_all" style="display:none;" onclick="toggleObj('btn_all2');"><span>선택 해제</span></button>
										<button type="button" class="btn_apply" onclick="codeChange2();"><span>적용</span></button>
									</div>
								</div>
							</div>

							<label for="myteamCheck" class="lab_check lab_on"><input type="checkbox" class="inp_check" id="myteamCheck" onclick="myteamCheck('snhyun82');"><span class="ico_comm ico_check"></span><span class="txt">MY TEAM</span></label>

						</div>

						<div class="box_btn">
							<a href="#" onclick="BoardWrite();"><span class="ico_comm ico_write"></span>게시글 작성</a>
						</div>

					</div>
					<div class="wrap_list" id="boardList">
						<ul class="list_type list_check">

							<li id="idx_1320" class="done on">
								<a href="#" onclick="BoardDetail('5','1320');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										기타
										</span>
										<em>#1320</em>
										<strong>test0704_02</strong>

											<span class="tag tag_complete">이슈종료</span>

									</span>
									<span class="info">
										<span class="txt">[@이다혜 : 2022-07-04 오전 11:22:14] →이다혜</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_1319" class="done">
								<a href="#" onclick="BoardDetail('5','1319');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										기타
										</span>
										<em>#1319</em>
										<strong>test0704</strong>

											<span class="tag tag_complete">이슈종료</span>

									</span>
									<span class="info">
										<span class="txt">[@이다혜 : 2022-07-04 오전 11:21:09] →이다혜</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_1318">
								<a href="#" onclick="BoardDetail('5','1318');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										오류(써브매물)
										</span>
										<em>#1318</em>
										<strong>오류 확인 요청입니다. </strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
									<span class="info">
										<span class="txt">[@성소영 : 2022-05-12 오후 3:54:13] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">1</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_1316" class="done">
								<a href="#" onclick="BoardDetail('5','1316');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										조직/담당자변경
										</span>
										<em>#1316</em>
										<strong>test</strong>

											<span class="tag tag_complete">이슈종료</span>

									</span>
									<span class="info">
										<span class="txt">[@임소윤 : 2022-05-12 오후 3:24:02] →임소윤</span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_1276">
								<a href="#" onclick="BoardDetail('5','1276');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										부동산써브 정책관련
										</span>
										<em>#1276</em>
										<strong>sadfsdf</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
									<span class="info">
										<span class="txt">[@김선호 : 2021-03-09 오후 2:15:41] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_256">
								<a href="#" onclick="BoardDetail('5','256');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										기타
										</span>
										<em>#256</em>
										<strong>기타 문의</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
									<span class="info">
										<span class="txt">[@대구_테스트 : 2020-03-23 오후 1:44:11] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_255">
								<a href="#" onclick="BoardDetail('5','255');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										RETS관련
										</span>
										<em>#255</em>
										<strong>RETS 문의</strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
									<span class="info">
										<span class="txt">[@대구_테스트 : 2020-03-23 오후 1:43:20] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

							<li id="idx_254">
								<a href="#" onclick="BoardDetail('5','254');">
									<!--span class=""></span-->

									<span class="tit">
										<span class="cate">
										단지관리
										</span>
										<em>#254</em>
										<strong>단지 관리 </strong>

											<span class="tag tag_request">접수전</span> <!-- 신규로 글 작성 되었을때 노출 텍스트 -->

									</span>
									<span class="info">
										<span class="txt">[@대구_테스트 : 2020-03-23 오후 1:42:18] </span>

										<span class="comment">
											<span class="inner">
												<span clsss="num">0</span>

											</span>
										</span>

									</span>
								</a>
							</li>

						</ul>
						          <div class="paging_comm">
            <a class="btn_comm btn_prev">이전</a>
            <span>1</span>
            <a href="?Page=2&amp;BoardIdx=5&amp;totcnt=113">2</a>
            <a href="?Page=3&amp;BoardIdx=5&amp;totcnt=113">3</a>
            <a href="?Page=4&amp;BoardIdx=5&amp;totcnt=113">4</a>
            <a href="?Page=5&amp;BoardIdx=5&amp;totcnt=113">5</a>
            <a href="?Page=6&amp;BoardIdx=5&amp;totcnt=113">6</a>
            <a href="?Page=7&amp;BoardIdx=5&amp;totcnt=113">7</a>
            <a href="?Page=8&amp;BoardIdx=5&amp;totcnt=113">8</a>
            <a href="?Page=9&amp;BoardIdx=5&amp;totcnt=113">9</a>
            <a href="?Page=10&amp;BoardIdx=5&amp;totcnt=113">10</a>
            <a class="btn_comm btn_next" href="?Page=11&amp;BoardIdx=5&amp;totcnt=113">다음</a>
          </div>

					</div>
				</div>
			</div>
		</div>
		<div id="mArticle">

<h2 class="screen_out">게시글 자세히보기</h2>
<div class="article_detail">
	<div class="section_detail">
		<ul class="list_cards">
			<li class="done">

				<div class="wrap_cards">
					<div class="box_info">
						<div class="tag tag_type99"><span>기타</span></div>
						<div class="tit">
							<h3 class="tit_detail">#1320 test0704_02 <span class="state">CLOSED</span></h3>
							<p class="time">2022-07-04 오전 11:22:14 최초작성 </p>
						</div>
						<div class="box_btn">
							<span class="name"><button type="button">@이다혜</button> <span>[미디어윌(본사)]</span><span class="layer_name">미디어윌(본사)</span></span>
						</div>
					</div>
					<div class="box_detail">
					    <p>test</p>
						<ul class="pholst" id="photolist"></ul>
						<span id="filelist"></span>
						<span id="filelist_gubun"></span>

						<div class="box_btn">

						</div>

					</div>
				</div>

				<div class="wrap_state">

					<!--start 진행상황 흐름도 -->
					<div class="box_state">

						현재상태 : <strong class="tag tag_complete">이슈종료</strong><button type="button" class="btn_on" onclick=""><span>전체상태보기</span></button>
					</div>

					<div class="box_progress"><span class="name"><button type="button">@이다혜</button></span><span class="time">(7/4 11:22)</span></div>

					<div class="box_progress_list" style="display:none;">

					<dl>
						<dt><button type="button">@이다혜</button><span class="time">(7/4 11:22)</span></dt>
						<dd>
						<!--할당한 관리자 id 확인을 위해 추가 20180821 권준호 차장 요청-->
						<strong>이슈종료</strong> 상태입니다</dd>
					</dl>

					</div>

					<!--end 진행상황 흐름도 -->
				</div>

				<form name="frmComment0" id="frmComment0" action="comment_ok.asp" method="post">
				<fieldset>
				<div class="wrap_write wrap_reply" style="display:none;">
					<div class="tit">답변(댓글) 등록</div>


					<input type="hidden" name="comment_file" value="Y">
					<input type="hidden" name="BoardIdx" value="5">
					<input type="hidden" name="bidx" value="1320">
					<input type="hidden" name="cururl" value="/board3/List.asp?BoardIdx=5">
					<dl class="subject">
						<dt>상태변경</dt>
						<dd>
							<div class="select">
								<label for="loaction1" class="btn"><span id="statLabel" class="btn_comm btn_select_option">상태변경</span></label>
								<select id="loaction1" name="stat">
									<option value="">상태변경</option>

								</select>
							</div>
							<div class="inp" style="border:0"><div class="inp_txt"></div></div>
						</dd>
					</dl>
					<dl>
						<dt>내용</dt>
						<dd>
							<div class="textarea">
								<textarea name="comment" cols="50" rows="10"></textarea>
							</div>
						</dd>
					</dl>
					<dl>
						<dt>첨부</dt>
						<dd>
							<input type="text" id="comment_tmpfilenm_0" name="tmpfilenm" class="w220" readonly="" style="display:none;">
							<input type="hidden" id="comment_fileimg_tnum_0" name="fileimg_tnum" value="0">
							<ul class="pholst" id="comment_photolist_0"></ul>
							<div class="box_inp mt0">
								<input type="file" id="comment_fileimg" name="fileimg" class="inp_file" title="0">
								<span class="txt"><span class="ico_comm ico_file"></span>파일 찾아보기</span>
							</div>
							<span id="comment_filelist_0"></span>
							<span id="comment_filelist_gubun_0"></span>
						</dd>
					</dl>
					<div class="box_btn">
						<button type="button" class="btn_cancel" onclick="">취소</button>
						<button type="button" onclick="commentWrite('0');">답변등록</button>
					</div>
				</div>
				</fieldset>
				</form>
			</li>

		</ul>
	</div>
</div>
</div>
</div>
</template>

<!--<script>-->
<!--import Header from "@/views/Header/Header";-->

<!--export default{-->
<!--  name:'',-->
<!--  components:{Header},-->
<!--  data(){-->
<!--    return{-->
<!--      sampleData:''-->
<!--    };-->
<!--  },-->
<!--  setup(){},-->
<!--  created(){},-->
<!--  mounted(){},-->
<!--  unmounted(){},-->
<!--  methods:{}-->
<!--}-->
<!--</script>-->
<style scoped>
@import '@/assets/board.css';
</style>
