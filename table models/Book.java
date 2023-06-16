import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "title", nullable = false)
  private String title;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "publisher_id", nullable = false)
  private Publisher publisher;

  @Column(name = "publication_date", nullable = false)
  private LocalDate publicationDate;

  @Column(name = "summary", nullable = false)
  private String summary;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_request_id")
  private BookRequest bookRequest;

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
    name = "book_author",
    joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id")
  )
  private Set<Author> authors = new HashSet<>();

  @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
    name = "book_category",
    joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "category_id")
  )
  private Set<Category> categories = new HashSet<>();

  // Constructors, getters, and setters

  public Book() {
  }

  public Book(String title, Publisher publisher, LocalDate publicationDate, String summary, BookRequest bookRequest) {
    this.title = title;
    this.publisher = publisher;
    this.publicationDate = publicationDate;
    this.summary = summary;
    this.bookRequest = bookRequest;
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

  public Publisher getPublisher() {
    return publisher;
  }

  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(LocalDate publicationDate) {
    this.publicationDate = publicationDate;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public BookRequest getBookRequest() {
    return bookRequest;
  }

  public void setBookRequest(BookRequest bookRequest) {
    this.bookRequest = bookRequest;
  }

  public Set<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(Set<Author> authors) {
    this.authors = authors;
  }

  public void addAuthor(Author author) {
    authors.add(author);
    author.getBooks().add(this);
  }

  public void removeAuthor(Author author) {
    authors.remove(author);
    author.getBooks().remove(this);
  }

  public Set<Category> getCategories() {
    return categories;
  }

  public void setCategories(Set<Category> categories) {
    this.categories = categories;
  }

  public void addCategory(Category category) {
    this.categories.add(category);
    category.getBooks().add(this);
  }

  public void removeCategory(Category category) {
    this.categories.remove(category);
    category.getBooks().remove(this);
  }
}
