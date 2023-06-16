import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

  public enum CategoryName {
    ADVENTURE, BIOGRAPHY, CHILDREN, DRAMA, EDUCATION, FANTASY, HISTORY, HORROR,
    MANGA, MYSTERY, POETRY, ROMANCE, SCIENCE_FICTION, SELF_HELP, THRILLER, TRAVEL
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "category_name", nullable = false)
  private CategoryName categoryName;

  public Category() {
  }

  public Category(CategoryName categoryName) {
    this.categoryName = categoryName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CategoryName getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(CategoryName categoryName) {
    this.categoryName = categoryName;
  }
}
