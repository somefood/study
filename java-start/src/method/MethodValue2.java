package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. num1 = " + number);
        changeNumber(number);
        System.out.println("4. num1 = " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. num2 = " + number);
        number = number * 2;
        System.out.println("3. num2 = " + number);
    }
}
