package method;

public class MethodCasting2 {
    public static void main(String[] args) {
//        double number = 1.5;
//        printNumber(number); // compile error
        printNumber(3);
        printNumber(3L);
        printNumber(3.0);
    }

    public static void printNumber(double n) {
        System.out.println("n = " + n);
    }
}
