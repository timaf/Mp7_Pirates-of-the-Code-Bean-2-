package at.refugeescode.tia_Dalma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestDalmaConfiguration {

    @Bean
    RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
