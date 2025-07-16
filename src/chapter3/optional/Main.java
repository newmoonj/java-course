package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
        Student moony = new Student("무니");
        camp.setStudent(moony);
        // Optional 객체 활용
        Optional<Student> studentOptional = camp.getStudent();
        boolean present = studentOptional.isPresent();

        if (present) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("no data");
        }

        // 1. student = null
//        Student student = camp.getStudent();
//        System.out.println("student = " + student);
//
//        // 직접적인 null 처리 방법
//        String studentName;
//        if (student != null) {
//            studentName = student.getName();
//        } else {
//            studentName = "등록된 학생이 아닙니다.";
//        } System.out.println("studentName = " + studentName);
        // 2. NullPointerException
        // 존재하지 않는 것에 대한 메서드 실행했을때(언체크 예외)

    }
}
