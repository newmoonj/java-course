package chapter1.variable;

public class Main {
    public static void main(String[] args) {
        // [자료형] [변수이름];
        // 정수형
        int a = 1;
        int b;
        b = 2;
        a = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 논리형
        boolean booleanBox = true; // false
        System.out.println("booleanBox = " + booleanBox);

        // 문자형
        char charBox = '뷁'; // 문자형 자료형은 따옴표로 표시한다.
        System.out.println("charBox = " + charBox);

        // 큰 정수형
        long longBox = 9999999999999L;
        System.out.println("longBox = " + longBox);

        // 실수형
        float floatBoxA = 0.12345678f;
        float floatBoxB = 0.1234567890f; // 넘어가는 자릿수 반올림 처리
        System.out.println("floatBoxA = " + floatBoxA); // 0.12345678
        System.out.println("floatBoxB = " + floatBoxB); // 0.12345679

        // double형
        double  doubleBox = 0.1234567890;
        System.out.println("doubleBox = " + doubleBox);

        // 캐스팅(Casting)
        // 업캐스팅 : 작은 데이터 -> 큰 상자
        // 묵시적(자동변환)
        int smallBox = 10;
        double bigBox = smallBox;
        System.out.println("bigBox = " + bigBox); // 10.0
        
        // 다운캐스팅 : 큰 데이터 -> 작은상자
        // 명시적 변환
        // 데이터 손실 발생
        double bigBox2 = 10.123;
        int smallBox2 = (int) bigBox2;
        System.out.println("smallBox2 = " + smallBox2); // 10

        // 문자열 데이터
        char a1 = 'a'; // 문자형 데이터 작은따옴표
        String str = "안녕, 난 'Moony' 야!"; // 문자열 데이터 큰 따옴표
        System.out.println("str = " + str);


    }
}


