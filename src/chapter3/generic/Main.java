package chapter3.generic;

public class Main {
    public static void main(String[] args) {
    // 1. 재사용 불가
        Box box1 = new Box(5);
        Box box2 = new Box(5);
        Box box3 = new Box(5);
        Box box4 = new Box(5);

    // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("box1");
        ObjectBox intBox = new ObjectBox(300);
    // 3. item을 활용하기 위해서는 Down Casting 필요
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

    }
}
