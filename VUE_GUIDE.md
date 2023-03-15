# Vue 구조 및 가이드
****
## 디렉토리 구조
└├│
```
example
    └ public
    │   ├ favicon.ico
    │   └ index.html
    ├ src
    │   ├ assets
    │       └ logo.png
    │   ├ componenets
    │       └ HelloWorld.vue
    │   ├ App.vue
    │   └ main.js
    │
    ├ .gitignore
    ├ babel.config.js
    ├ package-lock.json
    ├ package.json
    ├ README.md
    └ vue.config.js
```

<h2> public\ </h2>

- 가장 맨 처음 로드 되는 기본 HTML

<h2> src\ </h2>
<h3> 1. assets\ </h3>

-  초기에는 이미지만 저장되어 있으며, 보통 기타 부수적인 내용의 파일 및 폴더를 만들어 놓음

- css, image 등

<h3> 2. components </h3>

- 각각의 기능 및 웹 페이지들의 화면을 구성할 컴포넌트들로 구성되어 있음

- 각 각의 컴포넌트들은 독립적으로 만들어지며 호출하며 사용하는 형식

- 유지보수가 쉬우며 디버깅이 원활
 
- Single Page Application(SPA)라고도 함
 
- 네이밍의 경우 하나가 아닌 2 단어 이상으로 작성을 제안

- ex) SampleComponenet.vue

<h3> 3. App.vue </h3>

- 최상위 컨테이너

- vue router 처리

<h3> 4. main.js </h3>

- App.vue 파일을 로드하는 구조

- public/index.html > src/main.js > src/App.vue > componenets 순서로 로드

<h2> vue.config.js </h2>

- 환경설정 파일

<h2> babel.config.js </h2>

- 실행 환경에 영향받지 않고 항상 최신 자바스크립트 운용

<h2> package-lock.json </h2>

- npm을 사용하여 파일이 생성되는 시점의 의존성 트리에 대한 정보를 가지고 있음

<h2> package.json </h2>

- 프로젝트 정보와 의존성을 관리하는 문서