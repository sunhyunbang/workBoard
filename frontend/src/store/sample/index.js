import axios from "@/plugins/axios"; // API 호출을 위한 플러그인

export default {
  // namespaced: true,
  state: { // 전역 변수들의 집합
    counter: 0,
  },
  getters: { // state 의 변수들을 호출(Get)
    getCounter(state) { // state(고정) 를 사용하기 위한 파라미터
      return state.counter; // state > counter 를 리턴한다
    }
  },
  mutations: { // state 의 변수들을 저장하거나 조작하는 함수
    setCounter(state, data) { // state 파라미터와 함수 호출 시 전달할 변수(v, 파라미터명 변경 가능)
      state.counter = data;
    }
  },

  actions: { // 비동기 처리하는 함수(API 호출 등)
    counter({ commit }, v) {
      return commit("setCounter", v);
    },
    // 비동기로 API를 호출하기 때문에 async를 명시해줌 (그렇지 않으면 undefined)
    async getSampleData({ commit }, payload) { // get 형식 호출
      return await axios.get(`api/getSample?name=${payload}`) // get 형식은 ${} 를 사용하기 위해
          .then((res) => {                       // 따옴표("") 가 아닌 억음(``) 부호 사용
            return res.data; // 결과값 리턴
          })
    },
    async postSampleData({ commit }, payload) { // post 형식 호출
      return await axios.post("api/postSample", payload) // post 형식은 url에 파라미터가 노출되지 않도록 파라미터 주입
          .then((res) => {
            return res.data;
          })
    }
  },
};

