package mycode.chapter9;

public class ComicManager {

    private int value;

    public ComicManager(int value) {
        this.value = value;
    }

    boolean isOk() {
        return 60 <= value;
    }

    void tryConsume() {
        int tmp = value - 60;
        if (tmp < 0) {
            throw new RuntimeException();
        }
        value = tmp;
    }
}
