package at.refugeescode.tia_Dalma;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/duchmann")
public class TiaDalmaEndpoint {

    private RestTemplate restTemplate;

    public TiaDalmaEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @PostMapping
    String sendDatchmannUrl(@RequestBody String url){
        String sparrowUrl = "http://localhost:8080/tiaDalma";
        ResponseEntity <String> response2 = restTemplate.postForEntity(sparrowUrl, "http://localhost:9002/deadmanschest", String.class);
        return response2.getBody();

    }
}
