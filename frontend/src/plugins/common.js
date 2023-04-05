// // 전역에서 사용할 mixin 설정
// import Vue from "vue";
//
// export default function ({ store, route, app, getters }, inject) {
//   if (!Vue.__meta_mixin__) {
//     Vue.__meta_mixin__ = true;
//     const pageMeta = {
//       beforeCreate() {
//         // // 페이지에 meta title 옵션이 있는경우에만 작동
//         if (typeof this.$options?.meta != "undefined") {
//           let defaultOptions = {
//             backHide: false,
//             title: "",
//             isAppbar: true,
//             appbarClass: "header-white",
//             isProgress: false,
//             progressValue: "",
//             isQuestion: false,
//           };
//
//           let commonOptions = Object.assign(
//             defaultOptions,
//             this.$options?.meta
//           );
//
//           // common store에 저장
//           store.commit("common/setOptions", commonOptions);
//         }
//       },
//     };
//     Vue.mixin(pageMeta);
//   }
//
//   // 공통 method 선언부
//   const commonFunc = {
//     queryString: (params) => {
//       return (
//         "?" +
//         Object.entries(params)
//           .map((e) => {
//             e[1] = e[1] || "";
//             e[1] = encodeURIComponent(e[1]);
//             return e.join("=");
//             o;
//           })
//           .join("&")
//       );
//     },
//   };
//
//   inject("commonFunc", commonFunc);
// }
