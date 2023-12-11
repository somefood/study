package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        count = 0;
        this.max = max;
    }

    public void increment() {
        if (lessThanMaxCount()) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }

    private boolean lessThanMaxCount() {
        return count < max;
    }
}
