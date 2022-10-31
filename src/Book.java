import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublished;

    public Book(String name, Author author, int yearPublished) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    @Override
     public String toString (){
        return" Назание книги:" + this.bookName + "год выпуска" + this.yearPublished + author.toString();
    }

    @Override
    public boolean equals(Object o){
        if (this ==o) return true;
        if(o ==null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && bookName.equals(book.bookName) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(yearPublished, bookName, author);
    }
}




