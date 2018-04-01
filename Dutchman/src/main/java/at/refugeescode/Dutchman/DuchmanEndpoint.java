package at.refugeescode.Dutchman;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deadmanschest")
public class DuchmanEndpoint {


    @GetMapping
    String speak(){
        return "I am dead";
    }

}

