package RO;

import java.util.Map;
import java.util.TreeMap;

public class StudentGroup {
    private Map<Integer,Student> students = new TreeMap<>();
    public void addStudent(Student student){
        students.put(student.getId(), student);
    }
    public void removeStudent(int id){
        students.remove(id);
    }
    public Student getStudent(int id){
        return students.get(id);
    }
    public Student getTopStudent(){
        int top = -1;
        int topidx = -1;
        for (Map.Entry<Integer,Student> entry : students.entrySet()){
            if (entry.getValue().getAvarageGrade() > top){
                topidx = entry.getKey();
                top = entry.getValue().getAvarageGrade();
            }
        }
        return getStudent(topidx);
    }

    @Override
    public String toString() {
        String s = "";
        for (Map.Entry<Integer,Student> entry : students.entrySet()){
            s+="\n"+entry.getValue();
        }
        return s;
    }
}
