import axios from '@/plugins/axios';

export default ({
    namespaced: true,
    state: {
        account: {
            id: "test123",
            pw: "password"
        }
    },
    getters: {},
    mutations: {},
    actions: {
        async getAccount({commit}, payload) {
            return await axios
                .post("/api/login", payload)
                .then((response) => {
                    return response.data;
                });
        },
        getSample({commit}) {
            return axios
                .get("/api/sample")
                .then((response) => {
                    return response.data;
                })
        },
    },
});