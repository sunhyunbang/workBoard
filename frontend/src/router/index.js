import {createRouter, createWebHistory} from "vue-router";
import HomeView from "../views/HomeView.vue";
import Index from "../views/Index";
import axios from "@/plugins/axios";

const routes = [
    {
        path: "/sample",
        name: "sample",
        component: () => import("../views/sample/Sample"),
    },
    {
        path: "/",
        name: "index",
        component: Index,
        meta: {requiresAuth: true},
    },
    {
        path: "/sample",
        name: "sample",
        component: () => import("../views/sample/Sample"),
    },
    {
        path: "/Login",
        name: "login",
        component: () => import("../views/Login"),
        meta: {requiresAuth: false},
    },
    {
        path: "/logout",
        name: "logout",
        beforeEnter: (to, form, next) => { // 로그아웃 시 인증정보 제거
            localStorage.removeItem("token");
            axios.defaults.headers.common["Authorization"] = "";
            next({path: "/login", form: "Login"})
        },
    },
    {
        path: "/board",
        name: "board",
        component: () =>
            import("../views/Board/BoardList.vue"),
        meta: {requiresAuth: true},
    },
    {
        path: "/board/mylist",
        name: "mylist",
        component: () =>
            import("../views/Board/Mylist.vue"),
        meta: {requiresAuth: true},
    },

];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});
export default router;
