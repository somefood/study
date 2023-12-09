package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();// 입력을 String
        System.out.println("str = " + str);

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleVale = scanner.nextDouble();
        System.out.println("doubleVale = " + doubleVale);


    }
}
