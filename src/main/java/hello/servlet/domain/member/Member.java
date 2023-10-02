    package hello.servlet.domain.member;


    import lombok.Getter;
    import lombok.Setter;

    @Getter @Setter
    public class Member {

        private Long id;
        private String username;
        private int age;


        public Member() { //기본 생성자
        }

        public Member(String username, int age) { // alt + insert키 누르면 생성자 단축키
            this.username = username;
            this.age = age;
        }

    }
