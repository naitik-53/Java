public class variables {
    public static void main(String[] args) {
        byte age = 25;
        short year = 2026;
        int salary = 50000;
        long population = 1400000000L;
        float pi = 3.14f;
        double distance = 12345.6789;
        char grade = 'A';
        boolean isPassed = true;

        // Integer literals in different number systems
        int decimalNum = 42;
        int binaryNum = 0b101010;
        int octalNum = 052;
        int hexNum = 0x2A;

        System.out.println("Variables with Primitive Data Types:");
        System.out.println("byte age = " + age);
        System.out.println("short year = " + year);
        System.out.println("int salary = " + salary);
        System.out.println("long population = " + population);
        System.out.println("float pi = " + pi);
        System.out.println("double distance = " + distance);
        System.out.println("char grade = " + grade);
        System.out.println("boolean isPassed = " + isPassed);

        System.out.println("\nInteger literals (all equal to 42):");
        System.out.println("decimal 42 -> " + decimalNum);
        System.out.println("binary 0b101010 -> " + binaryNum);
        System.out.println("octal 052 -> " + octalNum);
        System.out.println("hex 0x2A -> " + hexNum);
    }
}
