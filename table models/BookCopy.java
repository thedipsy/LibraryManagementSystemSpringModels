import javax.persistence.*;

@Entity
@Table(name = "book_copy")
public class BookCopy {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "location_id", nullable = false)
  private BookLocation location;

  @Column(name = "edition", nullable = false)
  private Integer edition;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_format", nullable = false)
  private BookFormat bookFormat;

  public BookCopy() {
  }

  public BookCopy(Book book, BookLocation location, Integer edition, BookFormat bookFormat) {
    this.book = book;
    this.location = location;
    this.edition = edition;
    this.bookFormat = bookFormat;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public BookLocation getLocation() {
    return location;
  }

  public void setLocation(BookLocation location) {
    this.location = location;
  }

  public Integer getEdition() {
    return edition;
  }

  public void setEdition(Integer edition) {
    this.edition = edition;
  }

  public BookFormat getBookFormat() {
    return bookFormat;
  }

  public void setBookFormat(BookFormat bookFormat) {
    this.bookFormat = bookFormat;
  }
}
