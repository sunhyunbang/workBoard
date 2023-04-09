import axios from "axios";

const instance = axios.create({
    withCredentials: true, // Header에 Authorization이 있을 경우 true 처리
    baseURL: "http://localhost:3000",
});

export default instance;
