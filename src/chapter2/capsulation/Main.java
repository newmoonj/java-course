package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        // 생성자 호출
        Person person = new Person("jammon","연애중");
        Person personB = new Person("Hamong", "무니랑 연애중");

        // 인스턴스 변수 접근
//        person.name = "jammon";
//        person.secret = "??"

        // 인스턴스 메서드 접근
       person.methodA();
       personB.methodA();
//       person.methodB();

        // 게터
        String name = person.getName();
        System.out.println("name = " + name);


        // 세터
        String secret = personB.getSecret();
        personB.setSecret("무니를 사랑함");
        personB.methodA();

    }
}
