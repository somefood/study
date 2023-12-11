package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 소속이라 디폴트도 실행 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // private can't invoke
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
