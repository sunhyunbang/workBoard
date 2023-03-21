import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import Index from "../views/Index";

const routes = [
  {
    path: "/",
    name: "index",
    component: Index,
  },
  {
    path: "/Login",
    name: "login",
    component: () =>
      import("../views/Login"),
  },
  {
    path: "/sample",
    // component: () =>
    //   import("../views/sample/Scomponent.vue"),
  },
  {
    path: "/board",
    name: "board",
    component: () =>
      import("../views/BoardView.vue"),
  },
  {
    path: "/boardWrite",
    name: "boardWrite",
    component: () =>
      import("../views/BoardWriteView.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
