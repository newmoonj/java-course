package chapter2.statics;

public class Main {
    public static void main(String[] args) {
        // 클래스 멤버
        // static 변수, 메서드 활용
        System.out.println("static 변수 활용 : " + Person.population);
        // 객체 생성 없이 바로 클래스 레벨을 통해서 접근이 가능해졌다.
        // Person이 이미 프로그램 시작시점에 Method Area에 올라가있기 때문.

        Person.printPopulation();


        // 인스턴스 멤버 활용
        Person p1 = new Person();
        Person.printPopulation();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "moony";
        p2.name = "Hamong";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();
        Person.printPopulation();
    }
}
