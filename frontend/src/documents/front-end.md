# Front-end 개발 가이드

- [Front-end 개발 가이드](#front-end-개발-가이드)
    - [기본 세팅](#기본-세팅)
    - [1. NuxtJS Project 디렉토리 구조](#1-nuxtjs-project-디렉토리-구조)
        - [assets](#assets)
        - [components](#components)
        - [documents](#documents)
        - [layouts](#layouts)
        - [node\_modules](#node_modules)
        - [pages](#pages)
        - [plugins](#plugins)
        - [mixins](#mixins)
        - [static](#static)
        - [store](#store)
        - [nuxt.config.js](#nuxtconfigjs)
    - [2. Store Vuex](#2-store-vuex)
    - [3. 공통 가이드](#3-공통-가이드)

<small><i><a color="grey" href='http://ecotrust-canada.github.io/markdown-toc/'>generated with markdown-toc</a></i></small>

## 기본 세팅

- yarn, nodeJS 설치
- 프로젝트 클론 후 `yarn install`
- 로컬 서버 실행 `yarn dev`
- 라이브러리 설치 `yarn add {모듈라이브러리명}`

- 🌟VSCode Formatter 설치
  > 1. 확장 > 마켓플레이스에서 Prettier - Code formatter 설치
  > 2. `Ctrl + ,` 설정창 들어가서 `editor default formatter` 검색
  > 3. 없음 -> Prettier 로 설정 저장
  > 4. 파일 작성후 `Shift + Alt + F` 누르면 자동 포맷팅 됨

## 1. NuxtJS Project 디렉토리 구조

```js
└ 📁 assets
└ 📁 components
└ 📁 documents
└ 📁 layouts
└ 📁 node_modules
└ 📁 pages
└ 📁 plugins
└ 📁 mixins
└ 📁 static
└ 📁 store
└ nuxt.config.js
```

### assets

```js
└ 📁 assets // kebab-case 사용
    └ variables.scss
    └ index.css
```

Stylus 또는 Sass 파일, 이미지 또는 글꼴과 같은 컴파일되지 않은 자산

- common.scss : 공통적으로 적용되는 CSS
- variables.scss : 모든 SCSS 파일에서 사용할 변수에 대한 정의

### components

```js
└ 📁 components // PascalCase 사용
    └ 📁 common
        └ Header.vue
        └ AppBar.vue
```

Vue 페이지 내에서 재사용 가능한 요소들을 컴포넌트로 저장한다.
메뉴 depth, 또는 기능별로 디렉토리를 구분하고 파스칼 케이스 표기법을 사용한다.

### documents

```js
└ 📁 documents // kebab-case 사용
    └ frontend-guide.vue
```

가이드 등 참고용 문서들을 저장한다. 가급적 markdown 파일로 작성한다.

### layouts

```js
└ 📁 layouts // kebab-case 사용
    └ default.vue
    └ error.vue
    └ user.vue
    └ admin.vue
```

헤더, 사이드메뉴, 푸터 등 화면별 레이아웃을 저장한다.

```
ex) default.vue - 기본 레이아웃
    error.vue - 에러 화면 레이아웃
    user.vue - 사용자 화면 레이아웃
    admin.vue - 관리자 화면 레이아웃
```

### node_modules

```js
└ 📁 node_modules 
```

Nuxt 프로젝트에서 사용하는 모듈 라이브러리를 모아놓은 폴더이다.
build, 모듈 add시 변경됨.

### pages

```js
└ 📁 pages // kebab-case 사용
    └ 📁 sample
        └ main.vue
    └ 📁 notice
        └ list.vue
```

어플리케이션 화면을 저장한다. 생성된 디렉토리 및 파일명이 곧 url이 된다.

```
ex) /pages/sample/main.vue -> http://{domain}/sample/main
    /pages/notice/list.vue -> http://{domain}/notice/list
```

### plugins

```js
└ 📁 plugins // kebab-case 사용
    └ chart.js
    └ auth.js
```

plugins 디렉토리에는 Vue.js 애플리케이션을 인스턴스화하기 전에 실행하려는 Javascript 플러그인이 포함되어 있습니다.  
모든 페이지에서 사용하는 공통 컴포넌트, 공통 함수들을 정의한다.  
파일 작성 후 `nuxt.config.js` plugins 옵션에 설정 추가

### mixins

### static

```js
└ 📁 static // kebab-case 사용
    └ robots.txt
```

static 디렉토리에 있는 파일은 루트경로로 직접 매핑되고 변경되지 않을 가능성이 있는 파일을 포함한다.

```
ex) /static/robots.txt -> http://{domain}/robots.txt
```

### store

```js
└ 📁 store // kebab-case 사용
    └ 📁 sample
        └ index.js
    └ 📁 notice
        └ index.js
```

store 디렉토리는 저장소의 개념으로 Vuex Store 파일을 포함한다. store에 저장된 정보는 라우터가 이동해도 유지된다.  
메뉴 depth, 또는 기능별 디렉토리를 구분하고 하위에 `index.js`를 작성한다.

### nuxt.config.js

```js
└ nuxt.config.js
```

Nuxt 구성 파일

## 2. Store Vuex

`store` 디렉토리 아래에 `/기능별디렉토리/index.js` 파일로 생성한다.

```js
/*
    /sample/index.js
*/
export const state = () => ({ // 변수
    list: null
});

export const mutations = { // setter의 역할
    setList(list) {
        state.list = list
    }
}

export const actions = { // getter, 이벤트 주체
    getList({ commit }) {
        // axios를 통해 /sample/list 라는 API를 호출
        $axios.get('/sample/list').then(response){
            // 조회된 결과값을 list 라는 변수에 저장하는 setList mutations을 호출
            commit('setList', response.data)
        }
    }
}
```

Vue 화면에서의 사용법

1. `this.$store` 로 접근

```js
/*
    /sample/list.vue
*/
<script>
export default {
    methods: {
        getConsoleList() {
            // 1. sample Store의 list 변수를 콘솔로그로 출력
            console.log(this.$store.sample.state.list)

            // 2. actions 이벤트 호출
            this.$store.dispatch('sample/getList')

            // 3. mutations 호출
            const list = ['t','e','s','t']
            this.$store.commit('sample/setList', list)
        }
    }
}
</script>
```

2. `mapState`, `mapMutations`, `mapActions` 사용

- vuex를 더 편리하게 사용하게 해주는 helper

```js
/*
    /sample/list.vue
*/
<script>
// 필요한 vuex helper를 import
import { mapState, mapMutations, mapActions } from 'vuex'

export default {
    computed: {
        // 변수를 computed로 받아서 사용, sample store 이므로 디렉토리명을 표기해줌
        ...mapState('sample', [
            'list'
        ])
    }
    methods: {
        ...mapMutations('sample', {
            'setList'
        }),
        ...mapActions('sample', {
            'getList'
        }),
    }
}
</script>
```

## 3. 공통 가이드

```js
// vue 페이지 내 스크립트 선언 순서
<script>
export default {
    // 페이지 정보
    name: '',
    layout: '',
    meta: {},
    // import
    components: {},
    mixins: {},
    // 데이터
    props: [],
    data() {},
    watch(),
    computed(),
    // lifeCycle
    async asyncData({}) {},
    beforeCreate(),
    created(),
    beforeMount(),
    mounted(),
    // method
    methods(),
}
```
