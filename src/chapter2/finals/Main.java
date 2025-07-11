package chapter2.finals;

public class Main {
    public static void main(String[] args) {
        // final 활용 방법
        final int a = 1;
//        a = 2; // 오류
        System.out.println("a = " + a);

        // 상수 활용 방법
        System.out.println("상수 활용: " + Circle.PI);

        // 불변 객체 내부상태 필요한 경우
        Circle c2 = new Circle(10); // 새로운 객체 생성
        System.out.println("c2 = " + c2);
        Circle c3 = c2.changeRadius(20);
        System.out.println("c3 = " + c3);
    }
}
