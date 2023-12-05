package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b; // int 끼리 계산 했으니 결과도 int
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);

//        int z = 10 / 0; // 0으로 나누는건 수학적으로 허용하지 않고 이는 자바에서도 예외 발생
    }
}
