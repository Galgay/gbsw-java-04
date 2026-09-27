package ch06;


public class Calculator {
    private static Calculator calculator = null;
    // final -> 값이 할당된 이후 수정 불가
    public final static double PI = 3.14;

    public Calculator() {
    }

    // lazy loading
    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    // 필드도 static 가능
    // static String test;
    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    //정사각형의 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    //직사각형의 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }

    // 원의 둘레
    public static double getCircleLength(double r) {
        // r = 반지름
        return 2 * r * Calculator.PI;
    }

    // 가변 매개변수 (...)
    // int 자료형을 매개변수로 받을 예정이지만 몇 개가 입력될 지 모른다.
    // 몇 개가 될진 모르겠지만 values에 모두 담아두겠다.
    public int addAll(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum;
    }
}

