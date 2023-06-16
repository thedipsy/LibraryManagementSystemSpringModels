import javax.persistence.*;

@Entity
@Table(name = "book_reservation")
public class BookReservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_copy_id", nullable = false)
  private BookCopy bookCopy;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private Patron patron;

  @Enumerated(EnumType.STRING)
  @Column(name = "reservation_status", nullable = false)
  private ReservationStatus reservationStatus;

  @Column(name = "reservation_date", nullable = false)
  private Date reservationDate;

  public BookReservation() {
  }

  public BookReservation(BookCopy bookCopy, Patron patron, ReservationStatus reservationStatus, Date reservationDate) {
    this.bookCopy = bookCopy;
    this.patron = patron;
    this.reservationStatus = reservationStatus;
    this.reservationDate = reservationDate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BookCopy getBookCopy() {
    return bookCopy;
  }

  public void setBookCopy(BookCopy bookCopy) {
    this.bookCopy = bookCopy;
  }

  public Patron getPatron() {
    return patron;
  }

  public void setPatron(Patron patron) {
    this.patron = patron;
  }

  public ReservationStatus getReservationStatus() {
    return reservationStatus;
  }

  public void setReservationStatus(ReservationStatus reservationStatus) {
    this.reservationStatus = reservationStatus;
  }

  public Date getReservationDate() {
    return reservationDate;
  }

  public void setReservationDate(Date reservationDate) {
    this.reservationDate = reservationDate;
  }
}
