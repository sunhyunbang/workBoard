import { createStore } from "vuex";
// import module from "@/store/module";

export default createStore({
  namespaced: true,
  state: {},
  getters: {},
  mutations: {},
  actions: {
    async login({ commit }, params ) {
      return await this.$axios
          .post("/api/login", params)
          .then((response) => {
              console.log(response)
            return response.data;
          });
    }
  },
  modules: {
      module,
  },
});
