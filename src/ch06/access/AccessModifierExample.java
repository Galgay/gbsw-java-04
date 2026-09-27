package ch06.access;

import ch06.access.test.PublicTest2;

public class AccessModifierExample {
    public static void main(String[] args) {
        PublicTest publicTest = new PublicTest();

        // public - 클래스 내부/외부에서 모두 참조 가능
        // private - 클래스 내부에선 참조 가능, 외부에서 참조 불가능
        // default - 같은 패키지 내의 클래스에서 참조 가능, 다른 패키지에서는 불가능

        // 접근제한자는 클래스, 필드, 메서드, 생성자 등 클래스를 구성하는 모든 요소에 붙일 수 있다.
        // 다만 private class는 사용할 수 없다.


        // Public Class 실습
        String field1 = publicTest.field1; // public
//        String field2 = publicTest.field2; // private
        String field3 = publicTest.field3; // default

        publicTest.method1(); // public
//        publicTest.method2(); // private
        publicTest.method3(); // default

        // Default Class 실습
        DefaultTest defaultTest = new DefaultTest();
        field1 = defaultTest.field1; // public
//        field2 = defaultTest.field2; // private
        field3 = defaultTest.field3; // default

        defaultTest.method1(); // public
//        defaultTest.method2(); // private
        defaultTest.method3(); // default

        // Default Class 외부 패키지 실습
//        DefaultTest2 defaultTest2 = new DefaultTest2();

        // Public 클래스지만,
        // field3/method3()은 default 멤버로,
        // 외부 패키지에서는 해당 필드와 메서드를 사용할 수 없다.
        PublicTest2 publicTest2 = new PublicTest2();
        field1 = publicTest2.field1;
        publicTest2.method1();
    }
}
