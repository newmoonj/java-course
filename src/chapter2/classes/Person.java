package chapter2.classes;

public class Person {
    // 1. 속성 - 변수 선언으로 표현
    String name; // 이름
    int age;
    String address;
    // 2. 생성자 - 조립설명서
    // 특징 : 1) 클래스와 이름이 같다. 2) 반환 자료형 x  3) 여러개가 존재할 수 있다.
    // Person(){} // 기본생성자. 자동생성. 눈에 안보임.
    Person(String name, int age) {
        this.name = name; // this는 객체 자신을 의미. 속성의 변수를 설정함.
        this.age = age;
    }
    // 3. 기능(메서드 부분)
    int sum(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    // 게터 - 속성을 가져오는 기능
    String getName(){
        return this.name;
    }

    // 세터 - 속성을 설정하는 기능
    void setAddress(String address){
        this.address = address;

    }
}
