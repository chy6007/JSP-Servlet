
# Java Web Programming 실습 with Java Servlet and JSP
## 개발 환경 구축해 보기
- IDE(Integrated Development Environment)
 - Eclipse
- SDK(Software Development Kit)
 - JDK 8
- WAS(Web Application Server)
 - Tomcat
- VCS(Version Control System)
 - GitHub

## Java Web Programming - 1
- 시나리오 
   1. 사용자가 브라우저에 http://localhost:8080/ 입력 한다.
   2. 서버는 사용자의 이름과 별명을 입력 받을 수 있는 웹 페이지를 보여 준다.
   3. 사용자가 이름을 'James Gosling'을 입력 후 '제출' 버튼을 누른다
     - 서버는 아래와 같은 메지시가 담긴 웹 페이지를 보여 준다.
   		James Gosling(별명) 은 나이가 49세 입니다.
   4. 사용자가 이름을 'Grady Booch'을 입력 후 '제출' 버튼을 누른다
      - 서버는 아래와 같은 메지시가 담긴 웹 페이지를 보여 준다.
   		Grady Booch(별명) 은 나이가 50세 입니다.
- 제약 조건
   - JSP 2개(요청 JSP, 응답 JSP)와 Servlet 1개를 이용하여 구현

## JavaBean 적용해 보기 - 2
 - 시나리오는 위와 같음
 - 제약 조건
   - 현재 JSP에서 코딩 되어 있는 Java 코드를 Servlet 이동 
   - JavaBean 클래스를 생성(PersonBean)
     - PersonBean은 name, nickname, age를 field 로 가지고 있음
   - Servlet 에서 PersonBean을 이용하여 데이터를 담고 이를 응답 JSP로 객체를 넘기고 JSP에서는 PersonBean의 값만 조회하여 HTML 생성 
