import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import Index from "../views/Index";

const routes = [
  {
    path: "/",
    name: "index",
    component: Index,
    meta : { requiresAuth : true },
  },
  {
    path: "/Login",
    name: "login",
    component: () => import("../views/Login"),
    meta : { requiresAuth : false },
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
      import("../views/Board/BoardList.vue"),
    meta : { requiresAuth : true },
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

router.beforeEach((to, from, next) => {
  console.log("requiresAuth : " + to.meta.requiresAuth);
  if (!localStorage.getItem("member")) {
    if(to.meta.requiresAuth) {
      alert("로그인 후 이용해주세요.");
      next({name: "login"});
    }else {
      next();
    }
  }else {
    next();
  }
});

export default router;
