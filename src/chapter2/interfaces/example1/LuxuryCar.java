package chapter2.interfaces.example1;

public class LuxuryCar implements Car {
    @Override
    public void drive() {
        System.out.println("멋지게 이동합니다.");

    }

    @Override
    public void stop() {
        System.out.println("멋지게 정지합니다.");

    }
    // 인터페이스 확장
    void charge(){
        System.out.println("차량을 충전합니다.");
    }
}