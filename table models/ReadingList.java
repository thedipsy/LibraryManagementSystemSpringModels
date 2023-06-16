import javax.persistence.*;

@Entity
@Table(name = "reading_list")
public class ReadingList {

  @EmbeddedId
  private ReadingListId id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  @MapsId("userId")
  private Patron patron;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_id", nullable = false)
  @MapsId("bookId")
  private Book book;

  public ReadingList() {
  }

  public ReadingList(Patron patron, Book book) {
    this.patron = patron;
    this.book = book;
    this.id = new ReadingListId(patron.getId(), book.getId());
  }

  public ReadingListId getId() {
    return id;
  }

  public void setId(ReadingListId id) {
    this.id = id;
  }

  public Patron getPatron() {
    return patron;
  }

  public void setPatron(Patron patron) {
    this.patron = patron;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}
