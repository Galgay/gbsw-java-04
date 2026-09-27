package ch06.exam;

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student(
                "2026001",
                "김철수",
                80,
                90,
                70
        );
        Student student2 = new Student(
                "2026002",
                "이영희",
                90,
                85,
                95
        );
        student1.printInfo();
        System.out.println();
        student2.printInfo();
        System.out.println();
        student1.setScores(100, 90, 80);
        student1.printInfo();

        System.out.println();
        System.out.println("전체 학생 수: " + Student.getStudentCount());
    }
}
