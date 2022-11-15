package raisetech.homework7;

import java.net.URI;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/names")
  public List<String> getNames() {
    return List.of("Akane", "Nabiki", "Kasumi");
  }

  //POSTメソッドは入力した文字列が8文字以上20字以下なら受け付けるようにする
  @PostMapping("/names")
  public ResponseEntity<String> createUser(@RequestBody @RequestParam(value = "name") String name, @Validated UserForm form, UriComponentsBuilder builder) {
    // 登録処理は省略
    String path = "/names/" + form.getName();

    URI url = builder.path(path).build().toUri();

    return ResponseEntity.created(url).body("name successfully created");

  }

  //PATCHメソッドはPOSTと同じく入力した文字列が8文字以上20字以下なら受け付けるようにして、URLパラメータの「names/」の後に整数を入れる仕様
  @PatchMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> updateUser(@PathVariable("id") int id, @RequestBody @RequestParam(value = "name") String name, @Validated UserForm form, UriComponentsBuilder builder) {
    String ID = Integer.valueOf(id).toString();

    String path = "/names/" + ID + form.getName();

    URI url = builder.path(path).build().toUri();

    return ResponseEntity.ok(Map.of("message", "name successfully updated"));
  }

  @DeleteMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> deleteUser(@PathVariable("id") int id) {
    return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
  }

}
