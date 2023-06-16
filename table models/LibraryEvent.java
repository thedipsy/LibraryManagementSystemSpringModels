import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "library_event")
public class LibraryEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "event_name", nullable = false)
  private String eventName;

  @Column(name = "description", nullable = false)
  private String description;

  @Column(name = "event_datetime", nullable = false)
  private LocalDateTime eventDateTime;

  public LibraryEvent() {
  }

  public LibraryEvent(String eventName, String description, LocalDateTime eventDateTime) {
    this.eventName = eventName;
    this.description = description;
    this.eventDateTime = eventDateTime;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(LocalDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }
}
