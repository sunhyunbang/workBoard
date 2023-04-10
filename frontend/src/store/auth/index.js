import axios from "@/plugins/axios";

export default {
    namespaced: true,
    state: {
        member: {
            name: null,
        },
    },
    getters: {},
    mutations: {
        setAuthentication(state, data) {
            localStorage.setItem("token", data.token);
            state.member.name = data.name;
        },
    },
    actions: {
        // 로그인
        async login({commit}, payload) {
            return await axios.post("/api/login", payload).then((response) => {
                commit("setAuthentication", response.data);
            });
        },
        // 회원가입
        async register({commit}, payload) {
            console.log(payload);
            return await axios.post("/api/register", payload).then((response) => {
                return response.data;
            });
        },
        // 회원 정보 조회
        async getUser({commit}, id) {
            return await axios.get(`/api/user/get?account=${id}`).then((response) => {
                return response.data;
            });
        },
        // 관리자 정보 조회
        // 관리자 정보 조회
        async getAdmin({commit}, id) {
            return await axios
                .get(`/api/admin/get?account=${id}`)
                .then((response) => {
                    return response.data;
                });
        },
    },
};
