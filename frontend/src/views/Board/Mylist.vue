<script setup>
import Header from "@/components/Header/Header";

</script>

<template>
  <div class="index web">
    <div id="wrap">
    <Header/>
    <div id="content">
    <div id="cMain">
    <div id="mNav">
      <div class="article_nav">
        <h2 class="screen_out">마이리스트 게시판</h2>
        <div class="navigate">
          <a href="">Home</a><span class="txt_arr">&gt;</span><a href="">마이리스트 게시판</a><span class="txt_arr">&gt;</span><strong>마이리스트</strong>
        </div>
      </div>
    </div>
    <div id="mFeature">
      <div class="article_notice">
        <h3 class="tit_notice">공지사항</h3>
        <div class="section_list">
          <div class="wrap_list">
            <ul class="list_type list_check">

              <li>
                <a href="#" @click="NoticeBoardDetail('1,5','1299');">
									<span class="tit">
										<span class="cate"></span>
                    <!--em>&#35;1299</em-->
										<strong>test</strong>

                    <!--span class='tag ico_new">new</span>
                    <span class='tag ico_alert">긴급</span-->
									</span>
                  <span class="info">
										<span class="txt">[김선호 : 2021-03-09 오후 2:49:18]</span>
									</span>
                </a>
              </li>

              <li>
                <a href="#" @click="NoticeBoardDetail('1,5','1298');">
									<span class="tit">
										<span class="cate"></span>
                    <!--em>&#35;1298</em-->
										<strong>test</strong>

                    <!--span class='tag ico_new">new</span>
                    <span class='tag ico_alert">긴급</span-->
									</span>
                  <span class="info">
										<span class="txt">[김선호 : 2021-03-09 오후 2:46:57]</span>
									</span>
                </a>
              </li>

              <li>
                <a href="#" @click="NoticeBoardDetail('1,5','1297');">
									<span class="tit">
										<span class="cate"></span>
                    <!--em>&#35;1297</em-->
										<strong>test2</strong>

                    <!--span class='tag ico_new">new</span>
                    <span class='tag ico_alert">긴급</span-->
									</span>
                  <span class="info">
										<span class="txt">[김선호 : 2021-03-09 오후 2:43:55]</span>
									</span>
                </a>
              </li>

              <li>
                <a href="#" @click="NoticeBoardDetail('1,5','1296');">
									<span class="tit">
										<span class="cate"></span>
                    <!--em>&#35;1296</em-->
										<strong>test3</strong>

                    <!--span class='tag ico_new">new</span>
                    <span class='tag ico_alert">긴급</span-->
									</span>
                  <span class="info">
										<span class="txt">[김선호 : 2021-03-09 오후 2:42:36]</span>
									</span>
                </a>
              </li>

              <li>
                <a href="#" @click="NoticeBoardDetail('1,5','1294');">
									<span class="tit">
										<span class="cate"></span>
                    <!--em>&#35;1294</em-->
										<strong>test4</strong>

                    <!--span class='tag ico_new">new</span>
                    <span class='tag ico_alert">긴급</span-->
									</span>
                  <span class="info">
										<span class="txt">[김선호 : 2021-03-09 오후 2:41:05]</span>
									</span>
                </a>
              </li>

            </ul>
          </div>
        </div>
      </div>
    </div>
    <div id="mSub">
      <div class="article_list">
        <h3 class="screen_out">게시판 리스트</h3>
        <div class="section_list">
          <div class="wrap_tab">
            <ul class="list_tab">

              <li class="on"><button type="button"><span class="txt">MY</span><span class="num">1</span></button></li>

            </ul>
            <div class="box_btn">
              <a href="#" @click="BoardWrite('1');" style="float: right;margin-right: 320px;">+ 벼룩시장 업무요청 작성</a>
              <a href="#" @click="BoardWrite('5');">+ 부동산 써브 업무요청 작성</a>
            </div>
          </div>
          <div class="wrap_list">
            <ul class="list_type list_check">

              <li class="none">
                <p>해당 게시글이 없습니다.</p>
              </li>

            </ul>
          </div>
        </div>
      </div>

    </div>
  </div>
  </div>

    <div id="footer"><div class="capyright">©MediaWill Co., Ltd.</div></div>
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
@import '@/assets/common.css';


</style>
