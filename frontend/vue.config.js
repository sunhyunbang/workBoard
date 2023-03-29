const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,

  // build target
  outputDir: "../src/main/resources/static",

  devServer: {
    proxy: {
      "/api": {
        // 해당 값에 따라 8080으로 proxy 처리
        target: "http://localhost:9090",
        changeOrigin: true, // cross origin 허용
      },
    },
  },

  // false => 단일 name 컴포넌트 사용 가능
  lintOnSave: false,

  pluginOptions: {
    vuetify: {
      // https://github.com/vuetifyjs/vuetify-loader/tree/next/packages/vuetify-loader
    },
  },
});
