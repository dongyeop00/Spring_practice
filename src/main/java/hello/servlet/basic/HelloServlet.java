package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
//@WebServlet : 서블릿 애노테이션
//name : 서블릿 이름
//urlPattern : URL 매핑
public class HelloServlet extends HttpServlet {

    @Override
    //HTTP 요청을 통해 매핑된 URL이 호출되면 서블릿 컨테이너는 다음 메서드를 실행한다.
    //웹 브라우저 실행 : http://localhost:8080/hello?username=world
    //결과 : hello + world
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //ctrl + o 눌러서 service 선택

        System.out.println("HelloServlet.service"); //soutm + alt enter -> 클래스 이름 호출
        System.out.println("req = " + request); //soutv + alt enter -> 매개변수 확인
        System.out.println("request = " + request); //soutv + alt enter - 매개변수 확인

        //요청
        String username = request.getParameter("username");//request.getParameter("username"); 후 ctrl + alt + v
        System.out.println("username = " + username);

        //응답
        //Content-Type : text/plain;charset=utf-8
        response.setContentType("text/plain"); //단순 문자를 보낸다
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello + "+username);

    }
}
