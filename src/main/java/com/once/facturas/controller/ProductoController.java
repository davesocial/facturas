package com.once.facturas.controller;

import java.util.NoSuchElementException;

import com.once.facturas.model.Producto;
import com.once.facturas.model.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("{id}/")
    public Producto getProducto(
            @PathVariable("id") Long id
        ){
            
         try {
            return productoRepository.findById(id).get(); 
         } catch (NoSuchElementException e) {
             return null;
         }
    }

    @PostMapping ("/")
    public Producto creaProducto(
        @RequestBody Producto producto
    ) {
        Producto p = productoRepository.save(producto);
        return p;
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