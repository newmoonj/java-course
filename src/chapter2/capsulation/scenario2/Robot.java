package chapter2.capsulation.scenario2;

// 로보트를 걷게 만들자!
public class Robot {
    private boolean leftLeg;
    private boolean rightLeg;
    private boolean leftArm;
    private boolean rightArm;

//    public void setLeftLeg(boolean leftLeg) {
//        this.leftLeg = leftLeg;
//    }
//    public void setRightLeg(boolean rightLeg) {
//        this.rightLeg = rightLeg;
//    }
//    public void setLeftArm(boolean leftArm) {
//        this.leftArm = leftArm;
//    }
//    public void setRightArm(boolean rightArm) {
//        this.rightArm = rightArm;
//    }

    // 의미있는 세터
    public void walk(boolean power) {
        this.leftLeg = power;
        this.rightArm = power;
        this.rightLeg = power;
        this.leftArm = power;
    }
}
