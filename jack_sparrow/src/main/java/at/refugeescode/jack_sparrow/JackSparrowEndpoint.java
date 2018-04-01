package at.refugeescode.jack_sparrow;

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

   String askTiaDalma(){
        String tiaDalmaUrl = "http://localhost:9000/duchmann";

        ResponseEntity <String> responseEntity = restTemplate.postForEntity(tiaDalmaUrl, "where is the Duchmann?", String.class);
      String body = responseEntity.getBody();
      return body;
  }
    @PostMapping("/tiaDalma")
    String get(String body){
       return body;
    }


}

