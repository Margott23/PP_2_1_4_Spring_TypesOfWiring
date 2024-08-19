package koschei.config;

import koschei.models.Duck5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean(name = "duck")
    public Duck5 getDuck() {
        return new Duck5();
    }

}
