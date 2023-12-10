package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 18};
        int[] studentGrades = {90, 80, 100};

        for (int i = 0; i < studentGrades.length; i++) {
            System.out.println(studentNames[i] + " " + studentAges[i] + " " + studentGrades[i]);

        }
    }
}
