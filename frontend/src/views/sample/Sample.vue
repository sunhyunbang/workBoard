<script setup>
import { ref } from "vue";
import { useStore } from "vuex";

const store = useStore(); // useStore 훅을 사용하여 store 접근

// store 호출 관련
const data1 = store.state.sample.counter; // store.state 고정 sample/counter 호출
console.log("state 로 호출한 data =>", data1)

const data2 = store.getters.getCounter; // sample > getCounter 라는 getters 호출
console.log("getters 로 호출한 data =>", data2);

store.commit("setCounter", 10); // counter 에 10을 넣어줌
const data3 = store.state.sample.counter;
console.log("commit 후 state 로 호출한 data => ", data3);


const init = async () => {
  try {

  } catch (e) {
    console.log(e)
  }
}
const getApiCall = await store.dispatch("getSampleData", "박종섭")
console.log(getApiCall)

const postApiCall = await store.dispatch("postSampleData", {name : "박종섭"})
console.log(postApiCall)


const count = ref(0);
// function 과 const로 선언한 함수는 동일한 기능을 함
// 아래 두 함수는 동일한 기능을 함, 람다방식 선호
function countPlus1() {
  count.value ++;
}
const countPlus2 = () => {
  count.value ++;
}


</script>
<template>
  <div>
    <input type="button" @click="countPlus1" value="버튼"> <br/>
    <v-btn @click="countPlus2">버튼</v-btn> <br/>
    카운터 => {{ count }}
  </div>
  <div>
    state로 호출한 data => {{ data1 }} <br/>
    getters 로 호출한 data => {{ data2 }} <br/>
    commit 후 state 로 호출한 data => {{ data3 }} <br/>
  </div>
  <div>
    비동기 get api call => {{ getApiCall.email }}
  </div>
</template>
