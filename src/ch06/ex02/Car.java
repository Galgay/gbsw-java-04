package ch06.ex02;

public class Car {
    public Car(String company) {
        this.company = company;
    }


    // 회사
    public String company;

    // 모델명
    public String model;
    // 최고속도
    public int maxSpeed;
    // 생산년도
    public int productionYear;
    // 현재속도
    public int currentSpeed;
    // 시동 여부
    public boolean engineStart;
}
