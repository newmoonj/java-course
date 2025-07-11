package chapter2.inheritance.abstractexample;

// 추상클래스 선언
abstract class Animal {
    public String name;

    // 메서드를 강제 구현
    abstract void eat();

    public void sleep() {
        System.out.println("쿨쿨zzz...");
    }
}
