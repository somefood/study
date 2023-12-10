package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 21;
        student1.grade = 12;

        System.out.println("student1 = " + student1);

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 24;
        student2.grade = 15;
        System.out.println("student2 = " + student2);
    }
}
