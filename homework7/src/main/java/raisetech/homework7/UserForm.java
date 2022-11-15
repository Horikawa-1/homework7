package raisetech.homework7;

import org.hibernate.validator.constraints.Length;

public class UserForm {

  @Length(min=8, max=20 )
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
