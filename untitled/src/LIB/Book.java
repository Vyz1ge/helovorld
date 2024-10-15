package LIB;

import java.util.Objects;

public abstract class Book {
    private String title;
    private String autor;
    private int isbn;

    public Book(String title, String autor, int isbn) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
}
