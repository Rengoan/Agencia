package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * @author sinensia Juan Luis
 * Clase de inicio de la aplicación.
 */
@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" ,"com.curso.inicio"})
public class Application {

    /**
     * Método principal para iniciar la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Crea y devuelve un objeto RestTemplate para realizar llamadas a servicios REST.
     *
     * @return un objeto RestTemplate
     */
    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}

