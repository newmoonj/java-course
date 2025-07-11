package chapter3.exceptions;

public class Main {
    public static void main(String[] args) {
        // 1. 의도하지 않은 예외
//        int ret = 10 / 0;

    // 2. 의도적인 예외 - throw
        int age = 10;
        if (age < 19) {
            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
        }
        System.out.println("프로그램 종료");
    }

}
