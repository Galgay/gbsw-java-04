package ch06.exam;

public class Student {
    public final String studentId;
    public final String name;
    public int korean;
    public int english;
    public int math;
    private static int studentCount = 0;

    public Student(String studentId, String name, int math, int english, int korean) {
        this.math = math;
        this.english = english;
        this.korean = korean;
        this.name = name;
        this.studentId = studentId;
        studentCount++;
//        studentCount += 1;
//        studentCount = studentCount + 1;
    }

    // 해당 학생의 점수 총합 구하기
    public int getTotal() {
        return this.korean + this.english + this.math;
    }

    // 해당 학생의 점수 평균 구하기
    public double getAverage() {
        return this.getTotal() / 3.0;
    }

    // 해당 학생의 상세 정보 출력
    public void printInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("국어: " + korean);
        System.out.println("영어: " + english);
        System.out.println("수학: " + math);
        System.out.println("총점: " + getTotal());
        System.out.println("평균: " + getAverage());
    }

    public void setScores(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
