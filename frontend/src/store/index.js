import {createStore} from "vuex";
import createPersistedState from "vuex-persistedstate";
import auth from "./auth/index";
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
    plugins: [
        createPersistedState({
            /**
             * 새로고침 시 store > state 값을 유지할 path 들
             * paths에 module name을 명시하면 해당 module의 state는 localStorage에 자동으로 등록됨
             * */
            paths: ["auth"]
        })
    ]
});
