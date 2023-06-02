package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sinensia Juan Luis
 * Clase principal para iniciar la aplicación Spring Boot.
 */
@EntityScan(basePackages = {"com.curso.model"})
@EnableJpaRepositories(basePackages = {"com.curso.dao"})
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class Application {

    /**
     * Método principal que inicia la aplicación Spring Boot.
     *
     * @param args los argumentos de línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

