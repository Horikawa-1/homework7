package raisetech.homework7;

import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class UserForm {

  @NotEmpty
  @Length(max = 19)
  private String name;


  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }
}
