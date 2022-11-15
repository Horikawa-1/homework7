package raisetech.homework7;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class UserForm {

  @NotNull
  @Length(min = 1, max = 19)
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
