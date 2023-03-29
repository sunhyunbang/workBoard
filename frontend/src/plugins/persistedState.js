// import createPersistedState from "vuex-persistedstate";
//
// // Session Storage에 path에 지정된 store state 값을 저장함 => 새로고침해도 초기화 되지 않음
// export default ({ store, req }) => {
//   /*createPersistedState({
//     storage: window.sessionStorage,
//     key: 'evaluation',
//     paths: [
//       'evaluation.round.roundData',
//     ],
//   })(store)*/
//
//   createPersistedState({
//     storage: window.sessionStorage,
//     key: "targetInfo",
//     paths: ["evaluator.target.targetInfo"],
//   })(store);
//
//   createPersistedState({
//     storage: window.sessionStorage,
//     key: "indexes",
//     paths: ["question.history.indexes"],
//   })(store);
// };
