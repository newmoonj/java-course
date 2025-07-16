package chapter3.generic;
/**
 * 데이터를 담을 수 있는 박스(정수형)
 */
public class Box {
    // 속성
    private Integer item;

    // 생성자
    public Box(Integer item) {this.item = item;}

    // 기능
    public Integer getItem() {return item;}
}
