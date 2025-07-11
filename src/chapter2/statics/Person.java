package chapter2.statics;

public class Person {
    // 인스턴스 변수
    String name;


    // static 변수
    static int population = 0;



    Person() {
        population++; // 생성자가 호출 될 때 마다 population이 1씩 증가.
    }


    // 인스턴스 메서드
    void printName() {
        System.out.println("나의 이름은 " + this.name + "입니다.");

    }
    // static 메서드
    static void printPopulation(){
        System.out.println("현재 인구수: " + population);
    }


    //

}
