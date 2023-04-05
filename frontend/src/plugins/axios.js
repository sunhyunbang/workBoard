import axios from "axios";

const instance = axios.create({
  withCredentials: true, // Header에 Authorization이 있을 경우 true 처리
    baseURL: "http://localhost:3000",
});

  instance.interceptors.request.use(
      (config) => {

      let objMember = JSON.parse(localStorage.getItem("member"));
      console.log("objMember : " + objMember)
      if(objMember != null){
          const token = objMember.token;
          //instance.defaults.headers.common["Authorization"] = `Bearer ${token}`;
          config.headers.Authorization = `Bearer ${token}`;
      }

        config.headers["Access-Control-Allow-Origin"] = "*";
        return config;
      }
  )

// instance.interceptors.request.use(
//     function (config) {
//       // config.baseURL = "http://localhost:3000";
//       config.timeout = 60000;
//
//         let objMember = JSON.parse(localStorage.getItem("member"));
//         const token = objMember.token;
//
//       console.log("interceptor token :" + token);
//       if(token !== null | token !== "" || token !== "undefined"){
//         config.headers.Authorization = `Bearer ${token}`;
//       }
//       config.headers["Access-Control-Allow-Origin"] = "*";
//       config.headers["Access-Control-Allow-Methods"] = "GET , PUT , POST , DELETE , PATCH , OPTION";
//
//       config.responseEncoding = "utf8";
//       return config;
//     },
//     function (error){
//       return Promise.reject(error);
//     });
//
//     instance.interceptors.response.use(
//       function (response){
//         return response;
//       },
//         function (error){
//           return Promise.reject(error);
//     });
//

export default instance;
