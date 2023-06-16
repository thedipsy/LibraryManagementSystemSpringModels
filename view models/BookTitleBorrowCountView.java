
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_title_borrow_count")
public class BookTitleBorrowCountView {

  @Column(name = "title")
  private String title;

  @Column(name = "borrow_count")
  private Long borrowCount;

  public BookTitleBorrowCountView() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Long getBorrowCount() {
    return borrowCount;
  }

  public void setBorrowCount(Long borrowCount) {
    this.borrowCount = borrowCount;
  }
}
