package chapter2.capsulation.scenario2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        // 무분별한 세터

//        robot.setLeftLeg(true);
//        robot.setRightArm(true);
//        robot.setRightLeg(true);
//        robot.setLeftArm(true);

        // 의미있는 세터
        robot.walk(true);

    }
}
