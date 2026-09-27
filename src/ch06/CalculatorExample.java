package ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();

        double area1 = calc.areaRectangle(4);
        double area2 = calc.areaRectangle(3,6);
        System.out.println(area1);
        System.out.println(area2);

        System.out.println(calc.addAll(1,2,3,4,5,6));
//
//        int result = calc.add(1, 2);
//        int result2 = calc.sub(5, 3);
        int result = Calculator.add(1, 2);
        double doubleResult = Calculator.add(1.5, 2.3);
        int result2 = Calculator.sub(5, 3);

        double circleLength = Calculator.getCircleLength(6);


        System.out.println(result);
        System.out.println(result2);
    }
}
