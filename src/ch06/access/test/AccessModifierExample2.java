package ch06.access.test;

public class AccessModifierExample2 {
    public static void main(String[] args) {
        PublicTest2 publicTest2 = new PublicTest2();

        // public 클래스지만,
        // field3/method3()은 default 멤버로,
        // 같은 패키지 내에서 참조할 때만 사용 가능
        String field1 = publicTest2.field1;
        String field3 = publicTest2.field3;
        publicTest2.method1();
        publicTest2.method3();
    }
}
