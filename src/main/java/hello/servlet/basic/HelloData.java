package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData {

    private String username;
    private int age;

    /*
    lombok 의존 세팅을 했으면 애노테이션으로 프로퍼티 접근법을 바로 사용 가능
    1. getter and setter : 자바 프로퍼티 접근법 (값을 넣어주고 꺼내는 방식)
    ===========lombok이 생성하는 코드==============

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    */
}
