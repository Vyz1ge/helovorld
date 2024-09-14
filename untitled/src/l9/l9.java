package l9;

import java.util.Objects;

public class l9 {
    public static void main(String[] args) {
        //1
        Student student = new Student("Richard", "first");
        Teacher teacher = new Teacher("DDernait", "java");
        student.printInfo();
        teacher.printInfo();
        //2
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Reactangle(5, 10, "Red"),
                new Reactangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")

        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double c = 0;
        for (Figure figure:figures) {
            if (Objects.equals(figure.getColor(), "Red")){
                c+=figure.perimeter();
            }
        }
        return c;
    }
    public static double calculateRedArea(Figure[] figures){
        double c = 0;
        for (Figure figure:figures) {
            if (Objects.equals(figure.getColor(), "Red")){
                c+=figure.area();
            }
        }
        return c;
    }
}
