package ch06.ex03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("red", 1);
        Car car2 = new Car();
        System.out.println(car.color);
        System.out.println(car.cc);


        int myData; // camel
        int my_data; // snake
        System.out.println(car2.color);
    }
}
