package com.once.facturas.controller;

import com.once.facturas.model.Producto;
import com.once.facturas.model.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductoController
 */
@RestController
@RequestMapping (value = "/productos")
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @GetMapping ("/")
    public Iterable<Producto> getAllProductoS(){
        return productoRepository.findAll();
    }

    @RequestMapping("/producto")
    @ResponseBody
    public String producto(){
        return "Hola producto";
    }
    
    @RequestMapping("/count")
    @ResponseBody
    public String count(){
        return "Tengo " + String.valueOf(productoRepository.count()) + " productos.";
    }

}