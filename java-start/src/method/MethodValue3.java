package method;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. num1 = " + num1);
        num1 = changeNumber(num1);
        System.out.println("4. num1 = " + num1);
    }

    public static int changeNumber(int num2) {
        return num2 * 2;
    }
}
