
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_availability")
public class BookAvailabilityView {

  @Column(name = "book_title")
  private String bookTitle;

  @Column(name = "edition")
  private String edition;

  @Enumerated(EnumType.STRING)
  @Column(name = "format")
  private BookFormat format;

  @Column(name = "status")
  private String status;

  @Column(name = "location")
  private String location;

  public BookAvailabilityView() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public BookFormat getFormat() {
    return format;
  }

  public void setFormat(BookFormat format) {
    this.format = format;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
