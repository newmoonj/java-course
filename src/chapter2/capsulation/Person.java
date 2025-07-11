package chapter2.capsulation;

public class Person {
    // 속성 => 웬만하면 private, 외부 노출 필요한 경우만 public
    private String name;
    private String secret;

    // 생성자
//    Person(){} // default => 패키지 내부에서 접근 가능
     public Person(String name, String secret){
         this.name = name;
         this.secret = secret;
     }

    // 기능
    public void methodA() {
        System.out.println(name +"의 비밀은 "+ secret);
    }
    public void methodB() {}

    // 게터
    public String getName() {
        return name;
    }

    public String getSecret() {
        return secret;
    }

    // 세터

    public void setName(String name) {
        this.name = name;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
