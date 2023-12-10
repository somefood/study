package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 21;
        student1.grade = 12;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 24;
        student2.grade = 15;

        Student[] students = {student1, student2};

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
