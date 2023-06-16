
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "all_reservations_view")
public class AllReservationsView {

  @Column(name = "patron_first_name")
  private String patronFirstName;

  @Column(name = "patron_last_name")
  private String patronLastName;

  @Column(name = "patron_card_number")
  private String patronCardNumber;

  @Column(name = "book_title")
  private String bookTitle;

  @Column(name = "book_author")
  private String bookAuthor;

  @Enumerated(EnumType.STRING)
  @Column(name = "book_category")
  private Category bookCategory;

  @Column(name = "reservation_date")
  private Date reservationDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "reservation_status")
  private ReservationStatus reservationStatus;

  public AllReservationsView() {

  }

  public String getPatronFirstName() {
    return patronFirstName;
  }

  public void setPatronFirstName(String patronFirstName) {
    this.patronFirstName = patronFirstName;
  }

  public String getPatronLastName() {
    return patronLastName;
  }

  public void setPatronLastName(String patronLastName) {
    this.patronLastName = patronLastName;
  }

  public String getPatronCardNumber() {
    return patronCardNumber;
  }

  public void setPatronCardNumber(String patronCardNumber) {
    this.patronCardNumber = patronCardNumber;
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

  public ReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(ReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }
}
