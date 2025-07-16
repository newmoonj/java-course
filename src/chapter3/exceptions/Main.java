package chapter3.exceptions;

public class Main {
    public static void main(String[] args) {
        // 1. 의도하지 않은 예외
//        int ret = 10 / 0;

    // 2. 의도적인 예외 - throw
//        int age = 10;
//        if (age < 19) {
//            throw new IllegalArgumentException("미성년자는 접근할 수 없습니다.");
//        }

        // 3. 언체크 예외 호출
        ExceptionPractice exceptionPractice = new ExceptionPractice();
        exceptionPractice.callUncheckedException();

        // 4. 체크 예외 호출
        try {
            exceptionPractice.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }

        System.out.println("프로그램 종료");
        System.out.println("");


    }




}
