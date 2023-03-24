import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import emit from "mitt";
import axios from './plugins/axios';
// import VueCompositionApi from '@vue/composition-api';
//import axios from "axios"; // npm install --save axios


// [앱 생성]
const app = createApp(App);

// [글로벌 변수 선언]

//router
// app.config.globalProperties.$router = router;
// store
app.config.globalProperties.$store = store;
// event bus
app.config.globalProperties.$emit = emit;
// http 통신
app.config.globalProperties.$axios = axios;

// [사용 설정]
app.use(router);
app.use(store);
app.use(emit);
// app.use(VueCompositionApi);
app.mount("#app");
