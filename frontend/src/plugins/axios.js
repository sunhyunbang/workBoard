import axios from "axios";

const instance = axios.create({
  withCredentials: true, // Header에 Authorization이 있을 경우 true 처리
});

instance.interceptors.request.use(
    function (config) {
      config.baseURL = "http://localhost:3000";
      config.timeout = 60000;

        let objMember = JSON.parse(localStorage.getItem("member"));
        const token = objMember.token;

      console.log("interceptor token :" + token);
      if(token !== null | token !== "" || token !== "undefined"){
        config.headers.Authorization = `Bearer ${token}`;
      }
      axios.defaults.headers.common["Cache-Control"] = "no-cache";
      axios.defaults.headers.common["Pragma"] = "no-cache";
      axios.defaults.headers.common["Expires"] = "0";

      axios.defaults.headers.common["Content-Type"] = "application/json;";
      axios.defaults.headers.common["Access-Control-Allow-Origin"] = "*";
      axios.defaults.headers.common["Access-Control-Allow-Methods"] = "GET , PUT , POST , DELETE , PATCH , OPTION";

      config.responseEncoding = "utf8";
      return config;
    },
    function (error){
      return Promise.reject(error);
    });

    instance.interceptors.response.use(
      function (response){
        return response;
      },
        function (error){
          return Promise.reject(error);
    });


export default instance;
