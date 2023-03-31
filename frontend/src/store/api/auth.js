import axios from "@/plugins/axios";
import {store} from "core-js/internals/reflect-metadata";
import router from "@/router";

export default {
  namespaced: true,
  state: {
    // member: {
    //     account: null,
    //     nickname: null,
    //     name: null,
    //     email: null,
    //     roles: {},
    //     token: null,
    // },
    member: null,
  },
  getters: {},
  mutations: {
    setMember(state, data) {
      state.member = data;
      localStorage.setItem("member", JSON.stringify(data));
      axios.defaults.headers.common["Authorization"] = `Bearer ${data.token}`;
    },

    clearMember(state) {
      state.member = null;
      localStorage.removeItem("member");
      axios.defaults.headers.common["Authorization"] = null;
      router.push("/login").catch(error => {});
    },
  },
  actions: {
    // 로그인
    async login({ commit }, payload) {
      return await axios.post("/api/login", payload).then((response) => {
        commit("setMember", response.data);
      });
    },
    // 회원가입
    async register({ commit }, payload) {
      console.log(payload);
      return await axios.post("/api/register", payload).then((response) => {
        return response.data;
      });
    },
    // 로그아웃
    logout({ commit }) {
      return commit("clearMember");
    },
    // 회원 정보 조회
    async getUser({ commit }, id) {
      return await axios.get(`/api/user/get?account=${id}`).then((response) => {
        return response.data;
      });
    },
    // 관리자 정보 조회
    // 관리자 정보 조회
    async getAdmin({ commit }, id) {
      return await axios
        .get(`/api/admin/get?account=${id}`)
        .then((response) => {
          return response.data;
        });
    },
  },
};
