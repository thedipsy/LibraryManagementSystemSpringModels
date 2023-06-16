import javax.persistence.*;

@Entity
@Table(name = "book_rating")
public class BookRating {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private Patron patron;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_id", nullable = false)
  private Book book;

  @Column(name = "rating", nullable = false)
  private Integer rating;

  public BookRating() {
  }

  public BookRating(Patron patron, Book book, Integer rating) {
    this.patron = patron;
    this.book = book;
    this.rating = rating;
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

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }
}
