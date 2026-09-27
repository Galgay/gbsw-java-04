package ch06.ex03;

public class Car {
    Car(String color, int cc) {
        this.color = color;
        this.cc = cc;
    }

    // 생성자 오버로딩
    // 오버로딩이란
    // 생성자나 함수(메서드)의 매개 변수의 개수, 타입, 순서 등을 달리하여
    // 동일한 함수(메서드)에 대해 여러 개의 시그니처를 만드는 것을 의미한다.
    // 이 생성자를 예로, 차의 색상만 입력하거나, cc정보만 입력하는 등 여러 케이스에서도
    // 객체화에 문제가 없게끔 할 수 있다.
    Car(int cc, String color) {
        this.color = color;
        this.cc = cc;
    }

    Car() {
        // this -> 현재 클래스 자신을 가리키는 키워드
        // this를 이용해 해당 클래스 내 필드, 메서드 사용이 가능할 뿐만 아니라
        // this() 등을 이용해 해당 클래스의 생성자도 호출 가능하다.
        this("기본 색상", 0);
//        this.color = "기본 색상";
//        this.cc = 0;
    }
    String color;
    int cc;

}
