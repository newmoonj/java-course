package chapter2.interfaces.example1;

public class SpeedCar implements Car {
    @Override
    public void drive(){
        System.out.println("빠르게 이동합니다.");
    }

    @Override
    public void stop() {
        System.out.println("빠르게 정지합니다.");

    }

    // 인터페이스 확장
    void autoParking() {
        System.out.println("자동 주차 기능을 실행합니다.");
    }
}
