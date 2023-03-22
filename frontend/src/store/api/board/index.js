// variable
export const state = () => ({
    auth: {},
});

// variable save
export const mutations = {
    setAuth(state, data) {
        state.auth = data;
    }
};

// api call
export const actions = {
    async login({ commit }, params ) {
        return await this.$axios
            .post("/api/login", params)
            .then((response) => {
                return response.data;
            });
    }
};