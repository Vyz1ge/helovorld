/*
package Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person(1,"Tom");

        Class personclass = Person.class;
        Class personclass2 = person.getClass();
        Class personclass3 = Class.forName("Person");

        Method[] methods = personclass.getMethods();
        for (Method method : methods){
            System.out.println(method.getName()+"    "+method.getReturnType() +"    "+Arrays.toString(method.getParameterTypes())+"    "+ Arrays.toString(method.getParameterAnnotations())+"    "+ method.hashCode()+"    ");
        }
        System.out.println("\n\n\n"+"//////"+"\n\n\n");

        Field[] fields = personclass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName()+"    "+field.getType()+"     "+field.hashCode());
        }

        System.out.println("\n\n\n"+"//////"+"\n\n\n");

        Annotation[] annotations = personclass.getAnnotations();
        for (Annotation annotation: annotations){
            if (annotation instanceof Override){
                System.out.println("Yes");
            }
        }


    }
}
*/
