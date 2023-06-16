import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "librarian")
public class Librarian extends LibraryUser {

  @Column(name = "job_title", nullable = false)
  private String jobTitle;

  @Column(name = "hire_date", nullable = false)
  private LocalDate hireDate;

  public Librarian() {
  }

  public Librarian(String jobTitle, LocalDate hireDate) {
    this.jobTitle = jobTitle;
    this.hireDate = hireDate;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }
}
