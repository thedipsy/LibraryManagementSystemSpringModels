import javax.persistence.*;

@Entity
@Table(name = "membership")
public class Membership {

  public enum Package {
    STUDENT, STANDARD, SENIOR, NONE
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "price", nullable = false)
  private Double price;

  @Column(name = "package", nullable = false)
  @Enumerated(EnumType.STRING)
  private MembershipPackage membershipPackage;

  @Column(name = "active", columnDefinition = "boolean default true")
  private Boolean active;

  public Membership() {
  }

  public Membership(Double price, MembershipPackage membershipPackage, Boolean active) {
    this.price = price;
    this.membershipPackage = membershipPackage;
    this.active = active;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public MembershipPackage getMembershipPackage() {
    return membershipPackage;
  }

  public void setMembershipPackage(MembershipPackage membershipPackage) {
    this.membershipPackage = membershipPackage;
  }

  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }
}
