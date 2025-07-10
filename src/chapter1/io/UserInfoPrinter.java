package chapter1.io;

import java.util.Scanner;

public class UserInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: 사용자로부터 이름을 입력받기
        System.out.print("이름: ");
        String userName = scanner.nextLine();

        // TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이: ");
        int userAge = scanner.nextInt();

        // TODO: 입력받은 값 출력
        System.out.println("\n출력결과");
        System.out.println("userName = " + userName);
        System.out.println("userAge = " + userAge);
    }
}
