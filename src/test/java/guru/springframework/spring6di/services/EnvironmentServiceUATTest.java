package guru.springframework.spring6di.services;

import guru.springframework.spring6di.controllers.EnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
//@ActiveProfiles({"uat","EN"})
class EnvironmentServiceUATTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnv() {
        System.out.println(environmentController.getEnv());
    }
}