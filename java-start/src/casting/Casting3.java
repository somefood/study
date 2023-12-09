package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647; // int max
        long maxIntOver = 2147483648L; // int max + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}
