import java.util.ArrayList;
public class Book {
    String bookId;
    String title;
    String author;
    AvailabilityStatus availabilityStatus;
    Genre genre;

    protected Book(String bookId, String title, String author, Genre genre, AvailabilityStatus availabilityStatus) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(AvailabilityStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return
                "Book Id: " + bookId +
                        " , Title: " + title +
                        " , Author: " + author +
                        " , Genre: " + genre +
                        " , Availability Status: " + availabilityStatus;
    }
}
