package at.refugeescode.jack_sparrow;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping
public class JackSparrowEndpoint {

    private RestTemplate restTemplate;

    public JackSparrowEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

  @GetMapping("/tiaDalma")
   String askTiaDalma() {
      String tiaDalmaUrl = "http://localhost:9000/jacksparrow";
      ResponseEntity <String> responseEntity = restTemplate.getForEntity(tiaDalmaUrl, String.class);
      String duchmannUrl = responseEntity.getBody();
      System.out.println(duchmannUrl);


      ResponseEntity <String> massage = restTemplate.getForEntity(duchmannUrl, String.class);
      System.out.println(massage.getBody());
      return massage.getBody();
   }


}

