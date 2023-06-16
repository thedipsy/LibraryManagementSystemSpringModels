
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "borrowed_books_history")
public class BorrowedBooksHistoryView {

  @Column(name = "borrow_id")
  private Long borrowId;

  @Column(name = "borrower_name")
  private String borrowerName;

  @Column(name = "card_number")
  private String cardNumber;

  @Column(name = "book_title")
  private String bookTitle;

  @Column(name = "book_author")
  private String bookAuthor;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_format")
  private BookFormat bookFormat;

  @Column(name = "checkout_date")
  private Date checkoutDate;

  @Column(name = "return_date")
  private Date returnDate;

  @Column(name = "damage_description")
  private String damageDescription;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_category")
  private Category bookCategory;

  public BorrowedBooksHistoryView() {
  }

  public Long getBorrowId() {
    return borrowId;
  }

  public void setBorrowId(Long borrowId) {
    this.borrowId = borrowId;
  }

  public String getBorrowerName() {
    return borrowerName;
  }

  public void setBorrowerName(String borrowerName) {
    this.borrowerName = borrowerName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public BookFormat getBookFormat() {
    return bookFormat;
  }

  public void setBookFormat(BookFormat bookFormat) {
    this.bookFormat = bookFormat;
  }

  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public void setCheckoutDate(Date checkoutDate) {
    this.checkoutDate = checkoutDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }

  public String getDamageDescription() {
    return damageDescription;
  }

  public void setDamageDescription(String damageDescription) {
    this.damageDescription = damageDescription;
  }

  public Category getBookCategory() {
    return bookCategory;
  }

  public void setBookCategory(Category bookCategory) {
    this.bookCategory = bookCategory;
  }
}
