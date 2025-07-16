package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // for 명령형 스타일: 각요소 *10 처리
        List<Integer> multipliedNums = new ArrayList<>();
        for (Integer num : arrayList) {
            Integer multipliedNum = num * 10;
            multipliedNums.add(multipliedNum);
        }
        System.out.println("multipliedNums = " + multipliedNums);

        // stream 선언형 스타일: 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream()  // 1. 데이터 흐름 준비
                .map(num -> num * 10)       // 2. 중간 연산 등록
                .collect(Collectors.toList());      // 3. 최종 연산 단계
        System.out.println("ret2 = " + ret2);

    }
}