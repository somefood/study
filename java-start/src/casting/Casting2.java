package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.50;
        int intValue = 0;

        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue);

        System.out.println((int) 10.5);
        System.out.println("doubleValue = " + doubleValue);
    }
}
