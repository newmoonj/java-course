package chapter2.inheritance;

public class Parent {
    public String familyName = "스파르탄";
    public int honor = 10;

    public Parent() {
        System.out.println("부모생성자");
    };

    public void introduceFamily(){
        System.out.println("우리 "+ this.familyName +" 가문이 짱임");
    }
}
