
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_search_view")
public class BookSearchView {

  @Column(name = "id")
  private Long book_id; // You can use a suitable ID type for your application

  @Column(name = "title")
  private String title;

  @Column(name = "author_name")
  private String authorName;

  @Enumerated(EnumType.STRING)
  @Column(name = "category_name")
  private Category categoryName;

  @Column(name = "publication_date")
  private Date publicationDate;

  public BookSearchView() {
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

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Category getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(Category categoryName) {
    this.categoryName = categoryName;
  }

  public Date getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(Date publicationDate) {
    this.publicationDate = publicationDate;
  }
}
