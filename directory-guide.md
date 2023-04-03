# 패키지 구조 가이드

## 자바 디렉토리 구조

```js
└ 📁 java
    └ 📁 com
        └ 📁 sample
            └ 📁 sample
                └ 📁 domain // API 관련
                    └ 📁 board // Pascal Case 작성
                        └ 📁 controller // Rest API, controller 구성
                        └ 📁 application // service, handler 구성
                        └ 📁 dao // repository.class 인터페이스 구성
                        └ 📁 domain // domain.class 구성, DB와 직접 연결 클래스
                        └ 📁 dto // Dto.class 구성, domain을 훼손시키지 않기 위해 사용
                        └ 📁 exception // API 관련 exception을 모아둠
                └ 📁 global // 공통 관련
                    └ 📁 auth // security, jwt 등 로그인 관련 공통 클래스
                    └ 📁 common // 공통 클래스
                    └ 📁 config // 공통 설정 클래스
                    └ 📁 util // 공통 유틸 클래스
└ 📁 resources
    └ 📁 mapper // mybatis mapper xml 관련
    └ 📁 static // vue template, css 등
        └ 📁 css
        └ 📁 fonts
        └ 📁 img
        └ 📁 js
    └ 📄 application.properties // 자바 설정이 저장된 파일
```

## 계층형 디렉토리 구조
```
com
 ㄴ example
     ㄴ batch
         ㄴ config
         ㄴ controller
         ㄴ domain
         ㄴ repository
         ㄴ service
         ㄴ security
         ㄴ exception
```

- ### 장점
    * 전체적인 구조를 빠르게 파악할 수 있음
    * 배치의 경우 사용할 듯
- ### 단점
    * 각각의 디렉토리에 클래스들이 많이 생김(휴면 에러)
## 도메인형 디렉토리 구조
```
com
 ㄴ example
     ㄴ batch
         ㄴ domain               // 핵심 별도 패키지
         |   ㄴ user
         |   |   ㄴ api          // controller 클래스 구성(rest api만 취급)
         |   |   ㄴ application  // service, handler 클래스 구성
         |   |   ㄴ dao          // dao, repository 클래스 구성
         |   |   ㄴ domain       // entity 클래스 구성 
         |   |   ㄴ dto          // dto 클래스 구성
         |   |   ㄴ exception    // exception 클래스 구성
         |   ㄴ video
         |   |   ㄴ api
         |   |   ㄴ application
         |   |   ㄴ dao
         |   |   ㄴ domain
         |   |   ㄴ dto
         |   |   ㄴ exception
         |   ...
         ㄴ global               // 프로젝트 공통 패키지
             ㄴ auth             // 인증, 인가 관련 클래스 구성
             ㄴ common           // 공통 클래스, value 구성
             ㄴ config           // configuration 클래스 구성
             ㄴ error            // exception, error 관련 클래스 구성
             ㄴ infra            // 외부 모듈, api 클래스 구성
             ㄴ util             // util 성 클래스 구성
```

[참고 사이트](https://velog.io/@jsb100800/Spring-boot-directory-package)