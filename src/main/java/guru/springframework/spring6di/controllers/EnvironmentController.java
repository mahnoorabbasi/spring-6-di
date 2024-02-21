package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;


    public EnvironmentController(@Qualifier("envService") EnvironmentService environmentService) {
        this.environmentService = environmentService;

    }

    public String getEnv(){
        return environmentService.getEnv();
    }
}
