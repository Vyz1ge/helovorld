package RO;
import java.util.Map;
import java.util.TreeMap;
public class Student {
    private int id;
    private String name;
    private Map<String,Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        grades = new TreeMap<>();
    }

    public void addGrade(String subject, int grade){
        grades.put(subject,grade);
    }
    public int getAvarageGrade(){
        int c = 0;
        for (Map.Entry<String,Integer> entry : grades.entrySet()){
            c+=entry.getValue();
        }
        return c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}
