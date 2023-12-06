package loop;

public class While2_2 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        while (i < 10) {
            i += 1;
            sum += i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
