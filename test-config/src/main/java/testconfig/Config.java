package testconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testconfig.service.ProductionService;

@Configuration
public class Config {

    @Bean
    public ProductionService getProductionService() {
        return new ProductionService();
    }

}
