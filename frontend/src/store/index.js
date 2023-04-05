import { createStore } from "vuex";
import auth from "./api/auth";
import sample from "./sample/index";

export default createStore({
  namespaced: true,
  state: {},
  getters: {},
  mutations: {},
  actions: {},
  modules: {
    auth,
    sample
  },
});
