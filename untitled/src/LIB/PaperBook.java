package LIB;

public class PaperBook extends Book{
    private int pages;
    public PaperBook(String title, String autor, int isbn, int pages) {
        super(title, autor, isbn);
        this.pages = pages;
    }

    public String toString() {
        return "Б: "+this.getAutor()+" "+this.getTitle()+" количество страниц "+pages;
    }
}
