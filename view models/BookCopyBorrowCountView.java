
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "copy_borrow_count")
public class BookCopyBorrowCountView {

  @Column(name = "book_copy_id")
  private Long bookCopyId;

  @Column(name = "borrow_count")
  private Long borrowCount;

  public BookCopyBorrowCountView() {
  }

  public Long getBookCopyId() {
    return bookCopyId;
  }

  public void setBookCopyId(Long bookCopyId) {
    this.bookCopyId = bookCopyId;
  }

  public Long getBorrowCount() {
    return borrowCount;
  }

  public void setBorrowCount(Long borrowCount) {
    this.borrowCount = borrowCount;
  }
}
