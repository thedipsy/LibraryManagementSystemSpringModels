
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_active_reservations_view")
public class UserActiveReservationsView {

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "card_number")
  private String cardNumber;

  @Column(name = "book_title")
  private String bookTitle;

  @Column(name = "book_author")
  private String bookAuthor;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_category")
  private Category bookCategory;

  @Column(name = "reservation_date")
  private Date reservationDate;

  public UserActiveReservationsView() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  public Category getBookCategory() {
    return bookCategory;
  }

  public void setBookCategory(Category bookCategory) {
    this.bookCategory = bookCategory;
  }

  public Date getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(Date reservationDate) {
    this.reservationDate = reservationDate;
  }
}
