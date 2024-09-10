package l6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public String getName() {
        return fio;
    }

    public void setName(String name) {
        this.fio = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void evaluate(Student sdudent){
        Random r = new Random();
        int t = r.nextInt(4)+2;
        String evaluation = "";
        switch (t){
            case 2:{
                evaluation = "неудовлитворительно";
            }
            case 3:{
                evaluation = "удовлетворительно";
            }
            case 4:{
                evaluation = "хорошо";
            }
            case 5:{
                evaluation = "отлично";
            }
        }
        System.out.println("Преподаватель  "+fio+" оценил студента с именем "+sdudent.getFio()+" по предмету " + subject +" на оценку "+evaluation);
    }
}
