package variable;

public class Var6 {
    public static void main(String[] args) {
        int a; // 이렇게 하면 사용을 안 하는 것이기에 컴파일 시 자바가 최적화해서 안 보임

        // 자바는 변수 초기화를 강제한다.
        // 지역변수는 초기화를 해야하고, 인스턴스 변수는 알아서 줌
//        System.out.println(a);
    }
}
