

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "unreturned_books")
public class UnreturnedBooksView {

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "card_number")
  private String cardNumber;

  @Column(name = "title")
  private String title;

  @Column(name = "authors")
  private String authors;

  @Column(name = "book_checkout")
  private Date bookCheckout;

  @Column(name = "days_borrowed")
  private Long daysBorrowed;

  public UnreturnedBooksView() {
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public Date getBookCheckout() {
    return bookCheckout;
  }

  public void setBookCheckout(Date bookCheckout) {
    this.bookCheckout = bookCheckout;
  }

  public Long getDaysBorrowed() {
    return daysBorrowed;
  }

  public void setDaysBorrowed(Long daysBorrowed) {
    this.daysBorrowed = daysBorrowed;
  }
}
