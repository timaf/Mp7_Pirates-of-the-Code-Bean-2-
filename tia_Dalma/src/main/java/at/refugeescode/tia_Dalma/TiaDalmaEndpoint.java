package at.refugeescode.tia_Dalma;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jacksparrow")
public class TiaDalmaEndpoint {

    private RestTemplate restTemplate;

    public TiaDalmaEndpoint(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    String sendDuchmannUrl(){
      return "http://localhost:9002/deadmanschest";
    }

}
