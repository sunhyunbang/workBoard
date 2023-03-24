import {createStore} from "vuex";
import auth from "./api/auth";

export default createStore({
    namespaced: true,
    state: {},
    getters: {},
    mutations: {},
    actions: {},
    modules: {
        auth
    },
});
