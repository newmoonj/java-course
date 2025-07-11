package chapter2.inheritance;

public class Child extends Parent {


    public String familyName = "최씨";

    public Child() {
        super();
        System.out.println("자식생성자");
    }

    public void superTest(){
        System.out.println(super.familyName);
    }
    public void showSocialMedia() {
        System.out.println("SNS에서 우리 가문을 소개드립니다.");
    }

    @Override
    public void introduceFamily(){
        System.out.println("우리 "+ this.familyName +" 가문이 짱일까?");
    }
}
