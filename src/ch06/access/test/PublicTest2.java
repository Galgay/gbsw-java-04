package ch06.access.test;

public class PublicTest2 {
    public String field1;
    private String field2;
    String field3;

    // 클래스는 default, 생성자는 public인 경우,
    // 외부 패키지에서는 동일하게 참조 불가
    public PublicTest2() {};

    public void method1() {};
    private void method2() {};
    void method3() {};
}
