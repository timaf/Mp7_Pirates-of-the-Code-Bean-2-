package at.refugeescode.Dutchman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadmanschest")
public class DuchmanEndpoint {
    private String deadmanschest = "I am dead";

    @GetMapping
    String speak(){
        return deadmanschest;
    }

}

