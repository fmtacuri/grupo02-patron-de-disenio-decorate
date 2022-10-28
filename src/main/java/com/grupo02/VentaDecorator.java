/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo02;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author morti
 */

public class VentaDecorator implements Ventas {

    private final Ventas ventas = new VentaImpl();
            
    @Override
    public String obtenerProducto(String ubi, float precio, String categoria) {
        System.out.println("venta en decorator");
        return ventas.obtenerProducto(ubi, precio, categoria);
    }
    
     
    
    
    
}
