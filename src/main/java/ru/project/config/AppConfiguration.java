package ru.project.config;

import ru.project.model.cart.Cart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("ru.project")
public class AppConfiguration {

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }

}
