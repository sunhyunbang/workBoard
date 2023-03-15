const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  outputDir: "../src/main/resources/static", // build target
  devServer: {
    proxy: {
      '/': { // 해당 값에 따라 8080으로 proxy 처리
        target: 'http://localhost:8080',
        changeOrigin: true // cross origin 허용
      }
    }
  },
  lintOnSave: false, // false => 단일 name 컴포넌트 사용 가능
})