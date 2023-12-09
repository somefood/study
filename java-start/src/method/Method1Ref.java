package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        System.out.println("결과1 출력: " + add(1, 3));


        // 계산1
        System.out.println("결과2 출력: " + add(4, 5));

    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        return a + b;
    }
}
