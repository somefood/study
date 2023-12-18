package poly.ex.sender;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("페이스븍에 발송합니다: " + message);
    }
}
