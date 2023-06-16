import javax.persistence.*;

@Entity
@Table(name = "book_request")
public class BookRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private Patron patron;

  @Column(name = "book_title", nullable = false)
  private String bookTitle;

  @Column(name = "author", nullable = false)
  private String author;

  public BookRequest() {
  }

  public BookRequest(Patron patron, String bookTitle, String author) {
    this.patron = patron;
    this.bookTitle = bookTitle;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Patron getPatron() {
    return patron;
  }

  public void setPatron(Patron patron) {
    this.patron = patron;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
