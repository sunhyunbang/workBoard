// export default function ({ $axios, $auth, store, redirect, error: nuxtError }) {
//   $axios.onRequest((config) => {
//     store._vm.$nextTick(() => {
//       store._vm.$nuxt.$loading.start(); // AXIOS API 호출할때마다 로딩바 노출
//
//       // config.params['lang'] = app.i18n.locale;
//       config.params = config.params || {}; // get existing parameters
//       return config;
//     });
//   });
//
//   $axios.onResponse((response) => {
//     store._vm.$nextTick(() => {
//       store._vm.$nuxt.$loading.finish();
//       return response;
//     });
//   });
//   $axios.onResponseError((error) => {
//     if (error.response.data != undefined && error.response.data != "") {
//       if (
//         error.response.data.message != undefined &&
//         error.response.data.message != ""
//       ) {
//         alert(error.response.data.message);
//       }
//     }
//     if (
//       error.response.status == 400 &&
//       error.request.responseURL.indexOf(error.config.baseURL) < 0
//     ) {
//       redirect("/");
//     }
//
//     if (error.response.status == 401) {
//       $auth.loginWith("keycloak");
//     }
//   });
//
//   $axios.onError((error) => {
//     nuxtError({
//       statusCode: error.response.status,
//       message: error.message,
//     });
//     store._vm.$nextTick(() => {
//       store._vm.$nuxt.$loading.finish();
//       return Promise.resolve(false);
//     });
//   });
// }
