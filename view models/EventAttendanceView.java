
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "event_attendance")
public class EventAttendanceView {

  @Column(name = "event_id")
  private Long eventId;

  @Column(name = "event_name")
  private String eventName;

  @Column(name = "description")
  private String description;

  @Column(name = "event_datetime")
  private Date eventDatetime;

  @Column(name = "num_attendees")
  private Long numAttendees;

  public EventAttendanceView() {
  }

  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
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

  public Date getEventDatetime() {
    return eventDatetime;
  }

  public void setEventDatetime(Date eventDatetime) {
    this.eventDatetime = eventDatetime;
  }

  public Long getNumAttendees() {
    return numAttendees;
  }

  public void setNumAttendees(Long numAttendees) {
    this.numAttendees = numAttendees;
  }
}
