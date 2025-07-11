package chapter2.classes;

public class Main {
    public static void main(String[] args) {

        // 객체 생성(인스턴스화)
        Person personA = new Person("Moony", 30);
        Person personB = new Person("Jamon", 31);

        // 객체를 통해 속성에 접근 (객체가 담긴 변수.속성)
//        System.out.println("설정전 personA 이름: "+personA.name);
//        System.out.println("설정전 personB 이름: "+personB.name);
//        personA.name = "Osorii";
//        personB.name = "Chamyo";
//        System.out.println("설정후 personA 이름: "+personA.name);
//        System.out.println("설정후 personB 이름: "+personB.name);

        // 기능 활용
        int result1 = personA.sum(4567, 1111);
        int result2 = personB.sum(30+1,2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 게터 활용
        String name = personB.getName();
        System.out.println("name = " + name);

        // 세터 활용
        System.out.println("address = " + personA.address);
        personA.setAddress("서울");
        System.out.println("address = " + personA.address);

    }

}
