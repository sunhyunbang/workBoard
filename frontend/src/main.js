import {createApp} from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import vuetify from "./plugins/vuetify";
import axios from "./plugins/axios";
import {loadFonts} from "./plugins/webfontloader";
import instance from "./plugins/axios";

// loadFonts();

let token = localStorage.getItem("token");
// router 연결 전 token 검사
router.beforeEach((to, from, next) => {
    if (to.name === "logout") { // 로그아웃 페이지는 인증을 거치지 않음
        next();
    }
    if (localStorage.getItem("token")) { // 토큰 존재 시
        if (to.name === "login") { // 토큰 존재 시 루트 페이지로 이동
            next("/");
        }
        if (to.name === undefined) { // router에 등록되지 않은 경로 시
            alert("잘못된 경로로 접근하셨습니다.")
            router.go(-1); // 이전 페이지로 이동
        } else {
            next();
        }
    } else { // 토큰 없을 시
        if (to.name === "login") {
            next();
        } else {
            alert("로그인 후 이용해주세요.")
            next("/login");
        }
    }
})

// 요청 인터셉터
instance.interceptors.request.use(
    (config) => {
        if (token) {
            config.headers.Authorization = `Bearer ${token}`;
        }
        //config.headers["Access-Control-Allow-Origin"] = "*"; // header에 cors 허용
        //config.headers["Access-Control-Allow-Methods"] = "GET , PUT , POST , DELETE , PATCH , OPTION";
        //config.responseEncoding = "utf8";
        return config;
    },
    (error) => {
        return Promise.reject(error);
    }
);

// 응답 인터셉터
instance.interceptors.response.use(
    (response) => {
        // 2xx 범위의 정상적인 응답 시 수행
        if (token) {
        }
        return response;
    },
    (error) => {
        // 요청이 올바르지 않을 시 수행
        const response = error.response;
        if (response !== null || response !== "" || response !== undefined) {
            console.log(response.headers.get("errortype"))
            alert(response.data);
            if (response.status === 401) { // 계정, 인증
                if (response.headers.get("errortype") === "account") { // 계정 인증 에러

                } else if (response.headers.get("errortype") === "authority") { // 인증 에러 시에만 페이지 이동
                    router.push("/logout").then(() => {
                        router.go();
                    })
                }

            }
            else if (response.status === 403) { // 접근 권한
                router.go(-1);
            } else { // 그 외 5xx 등
                router.push("/logout").then(() => {
                    router.go();
                });
            }
        }
        return Promise.reject(response);
    }
);

createApp(App).use(router).use(store).use(vuetify).mount("#app");
