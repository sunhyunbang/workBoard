import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import Index from "../views/Index";

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
    meta : { requiresAuth : true },
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
    meta : { requiresAuth : false },
  },
  {
    path: "/logout",
    name: "logout",
    beforeEnter: (to, form, next) => {

      next({path: "/login", form: "Login"})
    },
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
  console.log("router Storage : " + localStorage.getItem("member"));
  if (!localStorage.getItem("member")) {
    if(to.meta.requiresAuth) {
      alert("로그인 후 이용해주세요.");
      next({name: "login"});
    }else {
      next();
    }
  }else {
    if(to.name == "login"){
      next("/");
    }else {
      next();
    }
  }
});

export default router;
