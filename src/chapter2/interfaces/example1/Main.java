package chapter2.interfaces.example1;

public class Main {
    public static void main(String[] args) {
        // 인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 인터페이스 활용
        luxuryCar.drive();
        speedCar.drive();

        luxuryCar.stop();
        speedCar.drive();

        // 인터페이스 확장
        luxuryCar.charge();
        speedCar.autoParking();
    }
}
