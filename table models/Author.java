import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "author")
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "author_name", nullable = false)
  private String authorName;

  @Column(name = "birth_date", nullable = false)
  private LocalDate birthDate;

  @Column(name = "biography")
  private String biography;

  public Author() {
  }

  public Author(String authorName, LocalDate birthDate, String biography) {
    this.authorName = authorName;
    this.birthDate = birthDate;
    this.biography = biography;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }
}
