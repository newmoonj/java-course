package chapter1.io;

// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
import java.util.Scanner;
// ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆

public class Main {
    public static void main(String[] args) {

        // 출력
        // print : 줄바꿈 없이 출력
        // println : 출력 후 줄 바꿈
        // \n : 개행문자
        System.out.print("Hello\nWorld!");
        System.out.println("My name is");
        System.out.println("Java.");

        // 입력(Scanner)
        // 스캐너 객체를 소환해서 스캐너형 박스(scanner)에 담아준다
        // ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
        Scanner scanner = new Scanner(System.in);
        // ☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆


        // 문자열 입력받기
        System.out.print("좋아하는 문장을 입력하세요: ");
        String sentence = scanner.nextLine();
        System.out.println("sentence = " + sentence);

        // 정수형(int, long) 입력받기
        System.out.print("정수(int)를 입력하세요: ");
        int intBox = scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print("정수(long)를 입력하세요: ");
        long longBox = scanner.nextLong();
        System.out.println("longBox = " + longBox);

        // 소수점
        System.out.println("소수점(double) 입력하세요: ");
        double doubleBox = scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);


    }
}
