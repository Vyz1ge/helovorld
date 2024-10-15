package LIB;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book javalang = new EBook("Java","A",22,100);
        Book python = new EBook("python","XXX",23,10);
        Book marketplace = new EBook("WB","Tatyana",24,300);
        Book markettop = new EBook("Ozon","Nik",25,200);
        Book physics = new PaperBook("Physycsforstudent","predodovatel",0,2000);
        Book math = new PaperBook("Physycsforstudent","Evgeniy",-1,1000);
        library.addbook(javalang);
        library.addbook(python);
        library.addbook(marketplace);
        library.addbook(markettop);
        library.addbook(physics);
        library.addbook(math);
        System.out.println(library);
    }
}
