import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
// import axios from './plugins/axios';
// import emit from "mitt";
// import createPersistedState from '@/plugins/persistedState';
// import persistedState from "@/plugins/persistedState";
// import VueCompositionApi from '@vue/composition-api';
// import axios from "axios"; // npm install --save axios


// [앱 생성]
const app = createApp(App);

// [글로벌 변수 선언]

//router 미사용
// app.config.globalProperties.$router = router;
// store
// app.config.globalProperties.$store = store;
// event bus
// app.config.globalProperties.$emit = emit;
// http 통신
// app.config.globalProperties.$axios = axios;

// [사용 설정]
app.use(router);
app.use(store);
// app.use(persistedState);
// app.use(VueCompositionApi);
app.mount("#app");
