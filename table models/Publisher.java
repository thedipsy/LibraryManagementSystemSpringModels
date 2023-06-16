import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "publisher_name", nullable = false)
  private String publisherName;

  @Column(name = "publisher_address", nullable = false)
  private String publisherAddress;

  @Column(name = "contact", nullable = false)
  private String contact;

  public Publisher() {
  }

  public Publisher(String publisherName, String publisherAddress, String contact) {
    this.publisherName = publisherName;
    this.publisherAddress = publisherAddress;
    this.contact = contact;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPublisherName() {
    return publisherName;
  }

  public void setPublisherName(String publisherName) {
    this.publisherName = publisherName;
  }

  public String getPublisherAddress() {
    return publisherAddress;
  }

  public void setPublisherAddress(String publisherAddress) {
    this.publisherAddress = publisherAddress;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }
}
