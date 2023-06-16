import javax.persistence.*;

@Entity
@Table(name = "event_users")
public class EventUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "event_id", nullable = false)
  private LibraryEvent event;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private LibraryUser user;

  @Column(name = "user_type", nullable = false)
  private String userType;

  public EventUser() {
  }

  public EventUser(LibraryEvent event, LibraryUser user, String userType) {
    this.event = event;
    this.user = user;
    this.userType = userType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LibraryEvent getEvent() {
    return event;
  }

  public void setEvent(LibraryEvent event) {
    this.event = event;
  }

  public LibraryUser getUser() {
    return user;
  }

  public void setUser(LibraryUser user) {
    this.user = user;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }
}
