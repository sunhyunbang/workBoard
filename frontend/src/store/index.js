import {createStore} from "vuex";
import account from "./api/account";

export default createStore({
    namespaced: true,
    state: {},
    getters: {},
    mutations: {},
    actions: {},
    modules: {
        account
    },
});
