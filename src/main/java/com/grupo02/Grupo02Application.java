package com.grupo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupo02Application {

    public static void main(String[] args) {
        SpringApplication.run(Grupo02Application.class, args);
        decorator();
    }

    public static void decorator() {
        System.out.println("Decorator");
        Ventas ventas = new VentaDecorator();
        
        System.out.println(ventas.obtenerProducto("Quito", 10, "Frutas"));
    }

}
