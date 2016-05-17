
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

## Java Web Programming
- 시나리오 
   1. 사용자가 브라우저에 http://localhost:8000/ 입력 한다.
   2. 서버는 사용자의 이름과 별명을 입력 받을 수 있는 웹 페이지를 보여 준다.
   3. 사용자가 이름을 'James Gosling'을 입력 후 '제출' 버튼을 누른다
     - 서버는 아래와 같은 메지시가 담긴 웹 페이지를 보여 준다.
   		James Gosling(별명) 은 나이가 49세 입니다.
   4. 사용자가 이름을 'Grady Booch'을 입력 후 '제출' 버튼을 누른다
      - 서버는 아래와 같은 메지시가 담긴 웹 페이지를 보여 준다.
   		Grady Booch(별명) 은 나이가 50세 입니다.
- 제약 조건
   - JSP 2개(요청 JSP, 응답 JSP)와 Servlet 1개를 이용하여 구현
