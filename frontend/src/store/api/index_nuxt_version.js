// variable
export const state = () => ({
    account: {
        id: 'test',
        pw: 'password'
    }

});

// variable save
export const mutations = {
    setAccount(state, data) {
        state.account = data;
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
export default class account {
}