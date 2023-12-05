package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128~127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f;
        double d = 10.0; // 실무에선 거의 더블 사용

        // 파일 다룰 땐 byte 사용
        // 자바는 4byte(int)를 효율적으로 사용하게 되어있다.
        // float은 정밀도가 떨어져서 double 사용
        // char 대신 String 사용
    }
}
