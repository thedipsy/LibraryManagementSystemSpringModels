import javax.persistence.*;

@Entity
@Table(name = "book_borrow")
public class BookBorrow {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private Patron patron;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_copy_id", nullable = false)
  private BookCopy bookCopy;

  @Column(name = "book_checkout", nullable = false)
  private Date bookCheckout;

  @Column(name = "book_return")
  private Date bookReturn;

  @Column(name = "damage")
  private String damage;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "checkout_librarian_id", nullable = false)
  private Librarian checkoutLibrarian;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "return_librarian_id")
  private Librarian returnLibrarian;

  public BookBorrow() {
  }

  public BookBorrow(Patron patron, BookCopy bookCopy, Date bookCheckout, Date bookReturn, String damage, Librarian checkoutLibrarian, Librarian returnLibrarian) {
    this.patron = patron;
    this.bookCopy = bookCopy;
    this.bookCheckout = bookCheckout;
    this.bookReturn = bookReturn;
    this.damage = damage;
    this.checkoutLibrarian = checkoutLibrarian;
    this.returnLibrarian = returnLibrarian;
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

  public BookCopy getBookCopy() {
    return bookCopy;
  }

  public void setBookCopy(BookCopy bookCopy) {
    this.bookCopy = bookCopy;
  }

  public Date getBookCheckout() {
    return bookCheckout;
  }

  public void setBookCheckout(Date bookCheckout) {
    this.bookCheckout = bookCheckout;
  }

  public Date getBookReturn() {
    return bookReturn;
  }

  public void setBookReturn(Date bookReturn) {
    this.bookReturn = bookReturn;
  }

  public String getDamage() {
    return damage;
  }

  public void setDamage(String damage) {
    this.damage = damage;
  }

  public Librarian getCheckoutLibrarian() {
    return checkoutLibrarian;
  }

  public void setCheckoutLibrarian(Librarian checkoutLibrarian) {
    this.checkoutLibrarian = checkoutLibrarian;
  }

  public Librarian getReturnLibrarian() {
    return returnLibrarian;
  }

  public void setReturnLibrarian(Librarian returnLibrarian) {
    this.returnLibrarian = returnLibrarian;
  }
}
