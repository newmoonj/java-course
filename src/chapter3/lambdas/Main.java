package chapter3.lambdas;

public class Main {
    public static void main(String[] args) {
//        Calculator1 calculator1 = new Calculator1();
//        int ret1= calculator1.sum(2,3);
//        System.out.println("ret1 = " + ret1);
//
        // 인터페이스를 활용한 익명클래스 만들기
        Calculator calculator1 = new Calculator() {


            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        int ret1 = calculator1.sum(2,3);
        System.out.println("ret1 = " + ret1);
    }
}
