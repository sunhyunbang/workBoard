import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import vuetify from "./plugins/vuetify";
import axios from "./plugins/axios";
import { loadFonts } from "./plugins/webfontloader";

loadFonts();
// localStorage.removeItem("token")
// router.beforeEach((to, from, next) => {
//     if (!localStorage.getItem("token")) {
//         alert("hello")
//         // next({path: "/login", name: "login"});
//         next()
//     }
//     // next();
// })
// router.beforeEach((to, from, next) => {
//     if (!localStorage.getItem("token")) {
//             // alert("로그인 후 이용해주세요.");
//             next({name: "login", path: "/login", query: {redirect: to.fullPath}});
//     }else {
//         next();
//     }
//     next();
// });

createApp(App).use(router).use(store).use(vuetify).mount("#app");
