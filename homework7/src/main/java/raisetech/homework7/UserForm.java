package raisetech.homework7;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class UserForm {

  @NotEmpty
  @Length(max = 19)
  private String name;
  private String id;
  public String getName() {
    return name;
  }

  public String getId() { return id;}

  public void setName(String name) {
    this.name = name;
  }
}
