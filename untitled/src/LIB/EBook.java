package LIB;

public class EBook extends Book{
    private int filesize;
    public EBook(String titile, String autor, int isbn, int filesize){
        super(titile,autor,isbn);
        this.filesize = filesize;
    }
    public String toString() {
        return "Э: "+this.getAutor()+" "+this.getTitle()+" размер файла в MB "+filesize;
    }
}
