# BookTopia

 도서 쇼핑몰 / 첫 프로젝트 <br>
 <자바 웹을 다루는 기술>을 참고한 클론 프로젝트
 - OOP를 기반으로 DB설계 및 객체를 기능별로 나누어 기획
 - RESTFul을 바탕으로 코드 작성

## ✔️ Part 
프론트/백엔드 : 박상순

## 📁 프로젝트 기능

- 회원가입 & 로그인
- 회원 마이페이지를 통한 정보 수정
- 관리자 페이지를 통한 회원, 상품, 주문 관리
- 검색 & 자동완성
- 장바구니
- 상품 주문 및 결제
<br/>

## 📕 기술 스택

#### 📙  프론트 엔드

- jsp
- CSS
- JavaScript(jQuery, ajax)
- tiles
- BootStrap


#### 📙 백엔드

- Spring
- MyBtis
- Oracle

<br/>


## 📦 개발 환경


- Eclipse
- VS Code
- Apache Tomcat

<br/>


## 📸 서비스 및 기능

<details markdown="1">
<summary>서비스 및 기능</summary>

- ### 메인 화면
<img src="src/main/webapp/resources/image/booktopia.PNG" width=500>

- ### 관리자 로그인 시 상단 메뉴
<img src="src/main/webapp/resources/image/login_admin.PNG" width=500>

- ### 회원 로그인 시 상단 메뉴
<img src="src/main/webapp/resources/image/login_member.PNG" width=500>

- ### 회원 마이 페이지
<img src="src/main/webapp/resources/image/mypage.PNG" width=500>

- ### 관리자 페이지
<img src="src/main/webapp/resources/image/adminpage.PNG" width=500>

- ### 자동 완성 기능 
<img src="src/main/webapp/resources/image/autosearch.PNG" width=500>

- ### 장바구니
<img src="src/main/webapp/resources/image/putbasket.PNG" width=500>
<img src="src/main/webapp/resources/image/basketpage.PNG" width=500>

- ### 주문 기능
<img src="src/main/webapp/resources/image/order1.PNG" width=500>
<img src="src/main/webapp/resources/image/order2.PNG" width=500>



## 기획 설계

- ### 사전 설계
<img src="src/main/webapp/resources/image/pre_design1.PNG" width=400><img src="src/main/webapp/resources/image/pre_design2.PNG" width=400>
<img src="src/main/webapp/resources/image/pre_design3.PNG" width=400><img src="src/main/webapp/resources/image/pre_design4.PNG" width=400>


- ### ERD
<img src="src/main/webapp/resources/image/erd.PNG" width=500>

</details>

## ✔️ 문제 발생 및 해결

<details markdown="1">
<summary>문제 및 해결</summary>

### 문제 : 도서 검색 후 장바구니 클릭 시 장바구니에 저장이 되지 않음
#### 원인 : 구현된 메서드가 없음

<img src="src/main/webapp/resources/image/error1.PNG" width=400>
<img src="src/main/webapp/resources/image/error2.PNG" width=400>
<br>

- 기존에 작성해둔 메서드로 연결을 하려 했으나 넘어가는 변수들의 타입이 달라 불가능
- VO타입으로 변수를 받도록 새로 메서드를 작성하여 ModelAndView 타입으로 리턴

### 새로운 문제 발생

- 문제 : VO타입을 Map에 넣는 과정 중 goodsDAO가 null이라는 에러가 발생
<img src="src/main/webapp/resources/image/new_error1.PNG" width=400>

- 원인 : 새로 작성한 메서드에서 서비스 객체를 @Autowired를 사용하지 않고 메서드 내에서 직접 생성하여 사용하려함
- 해결 : @Autowired를 사용하여 의존성 주입

<img src="src/main/webapp/resources/image/complete1.PNG" width=400>
<img src="src/main/webapp/resources/image/complete2.PNG" width=400>

<details>