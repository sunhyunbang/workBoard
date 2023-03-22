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
            console.log("접근")
            return await this.$axios
                .post("/api/login", payload)
                .then((response) => {
                    return response.data;
                });
        },

        async getSample({commit}) {
            return await this.$axios.get("/api/sample").then((response) => {
                return response.data;
            })
        }
    },
});