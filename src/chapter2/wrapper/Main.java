package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);

        // 참조형 변수(객체)
        Person personA = new Person(); // Heap 영역에 대한 메모리의 주소값이 저장
        System.out.println("personA = " + personA); // personA = chapter2.wrapper.Person@75b84c92
    
        // 참조형 변수(배열)
        int[] arr = {1,2,3,4,5};
        System.out.println("arr = " + arr); // arr = [I@6bc7c054

        // 래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        // 참조형 변수입니다.

        Integer num = 100;
        System.out.println("num = " + num); // 참조형 변수이나, 주소가 아니라 값이 나온다.
        // 내부적으로toString()이 오버라이딩되어 있기 때문.

        Integer numA = 123; // 래퍼클래스
        String strA = numA.toString(); // ✅ 편리한 기능
        System.out.println("strA = " + strA);


        int numB = 100; // 그냥 데이터 100
        // String strB = numB.toString(); // ❌ 변환 불가


        // 직접 만든 래퍼클래스
        CustomInteger myInteger =  new CustomInteger(10);
        String myStrInteger = myInteger.toString();

        // 오토박싱 -> 래퍼형으로 박싱
        Integer numC = 10;
        // Integer numC = Integer.valueOf(10);

        // 오토 언박싱 -> 기본형으로 언박싱
        int numD = numC;
        // int numD = numC.intValue();

    }
}
