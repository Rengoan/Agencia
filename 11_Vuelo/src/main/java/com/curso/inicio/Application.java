package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author sinensia Juan Luis
 * Clase de inicio de la aplicación.
 */
@EntityScan(basePackages = {"com.curso.modelo"})
@EnableJpaRepositories(basePackages = {"com.curso.dao"})
@SpringBootApplication(scanBasePackages = { "com.curso.controller", "com.curso.service" })
public class Application {

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

