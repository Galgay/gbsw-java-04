package ch06;

public class EarthExample {
    public static void main(String[] args) {
        Earth earth = new Earth();

        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_AREA + "km^2");
    }
}
