package co.istad.oauth2.webApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiController {

    @GetMapping("/public")
    Map<String, String> getPublicApi() {
        return Map.of("message", "This is a public API");
    }

    @GetMapping("/private")
    Map<String, String> getPrivateApi() {
        return Map.of("message", "This is a private API");
    }

}
