package Annot;
public class Person {
    private String name;
    private int id;

    public Person(String name, int id){
        this.name  = name;
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    @MyAnnotation(value = "ff",counter = 10120210)
    public void Test( String value){
         String hello = "hello";
    }

}
