package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 배열의 한계(정적)
        // 선언과 동시에 길이를 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // 컬렉션
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가
        names.add("Moony");
        names.add("Sam");
        names.add("Sam");
        names.add("Hamong");
        names.add("5sorrii");
        names.add("Baham");
        System.out.println("names = " + names);
        names.add("Bada");
        names.add("Chamyo");
        System.out.println("names = " + names);
        
        // 데이터 단건 조회
        String name4 = names.get(3);
        System.out.println("name4 = " + name4);

        // 데이터 삭제
        names.remove(2);
        System.out.println("names = " + names);
        names.remove("Bada");
        System.out.println("names = " + names);


        // HashSet 사용 방법
        HashSet<String> uniqueNames = new HashSet<>();

        // 데이터 추가
        uniqueNames.add("Moony");
        uniqueNames.add("Hamong");
        uniqueNames.add("홍길동");
        uniqueNames.add("5sorrii");
        uniqueNames.add("Baham");

        // 순서 보장 X -> get() 활용 불가
        System.out.println("uniqueNames = " + uniqueNames);

        // 중복 데이터 불가
        uniqueNames.add("Moony");
        System.out.println("uniqueNames = " + uniqueNames);

        // 데이터 제거
        uniqueNames.remove("홍길동");
        System.out.println("uniqueNames = " + uniqueNames);

        // Map 인터페이스를 구현한 HashMap
        // <키(""), 값(0)>
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("Moony", 10);
        memberMap.put("Hamong", 20);
        memberMap.put("5sorrii", 30);
        memberMap.put("Baham", 30);
        memberMap.put("Bada", 5);

        // 순서 보장X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가 : 값이 덮어쓰기 발쌩
        memberMap.put("Moony", 777);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer moonyNum = memberMap.get("Moony");
        System.out.println("moonyNum = " + moonyNum);

        // 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);

        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);

    }
}
