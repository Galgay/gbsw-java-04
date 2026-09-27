package ch06;

import ch06.ex02.Car;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        System.out.println("student1 변수가 Student 객체를 참조한다.");
//        Student student2 = new Student();
//        System.out.println("student2 변수가 또 다른 Student 객체를 참조한다.");

        Car car1 = new Car("현대");
        Car car2 = car1;

        car2.currentSpeed = 50;
        System.out.println(car1.currentSpeed);
        car2.currentSpeed = 60;
        System.out.println(car1.currentSpeed);
    }
}
