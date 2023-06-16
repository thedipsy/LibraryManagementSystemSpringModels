import javax.persistence.*;

@Entity
@Table(name = "book_location")
public class BookLocation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "section", nullable = false)
  private String section;

  @Column(name = "shelf", nullable = false)
  private Integer shelf;

  public BookLocation() {
  }

  public BookLocation(String section, Integer shelf) {
    this.section = section;
    this.shelf = shelf;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public Integer getShelf() {
    return shelf;
  }

  public void setShelf(Integer shelf) {
    this.shelf = shelf;
  }
}
