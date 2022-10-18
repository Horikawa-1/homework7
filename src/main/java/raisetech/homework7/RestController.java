package raisetech.homework7;

import java.net.URI;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/names")
  public List<String> getNames() {
    return List.of("akane", "nabiki");
  }

  @PostMapping("/names")
  public ResponseEntity<String> createName(@RequestBody @Validated @Length(min=8, max=20 ) CreateForm form) {
    // 登録処理は省略
    URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
        .path("/names/id") // id部分は実際に登録された際に発⾏したidを設定する
        .build()
        .toUri();
    return ResponseEntity.created(url).body("name successfully created");
  }

  @PatchMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
    // 更新処理は省略
    return ResponseEntity.ok(Map.of("message", "name successfully updated"));
  }

  @DeleteMapping("/names/{id}")
  public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
    return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
  }

}
