
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_availability")
public class BookAvailabilityView {

   @Column(name = "book_id")
  private Long bookId; 
  
  @Column(name = "title")
  private String bookTitle;

  @Column(name = "available_copies")
  private int availableCopies;

  public BookAvailabilityView() {
  }

  public Long getId() {
    return bookId;
  }

  public void setId(Long bookId) {
    this.bookId = bookId;
  }

  public String getBookTitle() {
    return bookTitle;
  }

  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getAvailableCopies() {
    return availableCopies;
  }

  public void setAvailableCopies(String availableCopies) {
    this.availableCopies = availableCopies;
  }

}
