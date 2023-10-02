<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  //request, response는 그냥 사용 가능
  MemberRepository memberRepository = MemberRepository.getInstance();

  System.out.println("MemberSaveServlet.service");
  String username = request.getParameter("username");
  int age = Integer.parseInt(request.getParameter("age"));

  //비지니스 로직 들어감
  //username, age 저장
  Member member = new Member(username,age);
  memberRepository.save(member);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
  <li>id=<%=member.getId()%></li>
  <li>username=<%=member.getUsername()%></li>
  <li>age=<%=member.getAge()%></li>

  <!-- 같은 결과인 다른 방법 1
  <li>id=<%=((Member)request.getAttribute("member")).getId()%></li>
  <li>username=<%=((Member)request.getAttribute("member")).getUsername()%></li>
  <li>age=<%=((Member)request.getAttribute("member")).getAge()%></li> -->

  <!-- 같은 결과인 다른 방법 2
  <li>id=${member.id}</li>
  <li>username=${member.username}</li>
  <li>age=${member.age}</li> -->

</ul>
<a href="/index.html">메인</a>
</body>
</html>
