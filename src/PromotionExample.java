public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);
        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);
        intValue = 50;
        long longValue = intValue;;
        System.out.println("longValue: " + longValue);
        longValue = 100;

        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);

        double pi = 3.14;
        int intPi = (int) pi; // 소수점 사라짐
        System.out.println("intPi: " + intPi);

        int charCode = 44032;
        char ch = (char) charCode; // Character 복원
        System.out.println(ch);

        double test = 1.2E8;


        // 정수 기준
        byte b; // 1byte
        short s; // 2byte
        int i; // 4byte
        long l; // 8byte

        // 실수 기준
        float f; // 4byte
        double d; // 8byte

        int a = 5;
        // (a++) == (a = a + 1)

        System.out.println(a++); // 6
        System.out.println(++a); // 7

        System.out.println(a);
        a = a + 1;
        a = a + 1;
        System.out.println(a);
    }

}
