
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_info_view")
public class UserInfoView {

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "address")
  private String address;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "card_number")
  private String cardNumber;

  @Column(name = "membership_package")
  @Enumerated(EnumType.STRING)
  private MembershipPackage membershipPackage;

  @Column(name = "case")
  private String caseStatus;

  public UserInfoView() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public MembershipPackage getMembershipPackage() {
    return membershipPackage;
  }

  public void setMembershipPackage(MembershipPackage membershipPackage) {
    this.membershipPackage = membershipPackage;
  }

  public String getCaseStatus() {
    return caseStatus;
  }

  public void setCaseStatus(String caseStatus) {
    this.caseStatus = caseStatus;
  }
}
