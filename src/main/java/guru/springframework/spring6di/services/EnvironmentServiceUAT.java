package guru.springframework.spring6di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Qualifier("envService")
@Profile("uat")
public class EnvironmentServiceUAT implements EnvironmentService {
    @Override
    public String getEnv() {
        return "uat";
    }
}
