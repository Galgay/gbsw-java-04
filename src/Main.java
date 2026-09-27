public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 비원시 자료형 (Non Primitive Type)
        String a = "문자열";

        // 원시 자료형 (Primitive Type)
        char ch = 'a'; // 2byte
        boolean bool = true; // 1byte
        byte bt = 125; // 1byte
        short sh = 32767; // 2byte
        int b = 1; // 4byte
        long l = 2100000000; // 8byte
        float c = 0.1f; // 4byte
        double d = 0.2; // 8byte

        int bin = 0b10; // 2진수 10 저장
        int oct = 010; // 8진수 저장
        int hex = 0xA8; // 16진수 저장

        // Array
        // [1,2,3,4,5]

        // Object
//         { name: "서정민", age: 27 }
        Person person = new Person(null, 27);
        String name = person.name;

        System.out.println(person);
        Person person1 = new Person("서정민", 27);
        Person person2 = new Person("서정민", 27);

        System.out.println(person1.equals(person2));

        int num1 = 10;
        int num2 = 3;
        double num3 = (double) num1 / num2;
        float num4 = (float) num3;
        System.out.println(num3);
        System.out.println(num4);

        char ch1 = 65;
        System.out.println(ch1);

        int[] intArr = {1, 2, 3};
        int[] intArr2 = new int[]{1, 2, 3};
        int[] intArr3 = new int[5];
        intArr2 = new int[]{1, 2, 3, 4, 5};

        int[][] testArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Week week = Week.MONDAY;
        System.out.println(week.name);
        System.out.println(week.code);

        String testStr = "test";
        System.out.println(testStr.charAt(0));

        Person person3 = new Person(null, 27);
        person3.speak("hi");

    }

    public static class Creature {
        String name;
    }

    public static class Person extends Creature{
        String name;
        // 20개
        int age;

        public void speak(String word) {
            System.out.println(word);
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 오버로딩 - 동일한 함수를 매개변수의 타입, 혹은 개수를 다르게 해서 호출하는 것
        // 오버라이딩 - 부모 클래스로부터 전달받은 메서드를 재정의하는 것

        public Person(String name) {
            this.name = name;
        }

        public Person(int age) {
            this.age = age;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }


            if (!(obj instanceof Person person)) {
                return false;
            }

            return age == person.age && name.equals(person.name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}