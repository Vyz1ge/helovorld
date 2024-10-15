package RO;
public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();

        Student student1 = new Student(101, "Alice");
        student1.addGrade("Math", 90);
        student1.addGrade("Science", 85);
        Student student2 = new Student(102, "Bob");
        student2.addGrade("Math", 75);
        student2.addGrade("Science", 95);
        Student student7 = new Student(100, "Alex");
        student7.addGrade("Math", 66);
        student7.addGrade("Science", 65);
        Student student3 = new Student(104, "Cictor");
        student3.addGrade("Math", 55);
        student3.addGrade("Science", 94);
        Student student4 = new Student(105, "Masha");
        student4.addGrade("Math", 35);
        student4.addGrade("Science", 91);
        Student student5 = new Student(106, "Egor");
        student5.addGrade("Math", 34);
        student5.addGrade("Science", 33);
        Student student6 = new Student(107, "Oleg");
        student6.addGrade("Math", 13);
        student6.addGrade("Science", 91);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        System.out.println(group);
    }
}

