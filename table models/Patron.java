import javax.persistence.*;

@Entity
@Table(name = "patron")
public class Patron extends LibraryUser {

  @Column(name = "card_number", unique = true, nullable = false)
  private Integer cardNumber;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "membership_id", nullable = false)
  private Membership membership;

  public Patron() {
  }

  public Patron(Integer cardNumber, Membership membership) {
    this.cardNumber = cardNumber;
    this.membership = membership;
  }

  public Integer getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Membership getMembership() {
    return membership;
  }

  public void setMembership(Membership membership) {
    this.membership = membership;
  }
}
