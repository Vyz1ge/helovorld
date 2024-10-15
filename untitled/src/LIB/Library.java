package LIB;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<Book> lib = new HashSet<Book>();
    public void addbook(Book book){
        lib.add(book);
    }


    @Override
    public String toString() {
        String s = "";
        for (Book x:lib){
            s+="\n"+x;
        }
        return s;
    }
}
