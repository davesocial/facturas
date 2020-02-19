package com.once.facturas.controller;

import com.once.facturas.model.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ProductoController
 */
@Controller
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @RequestMapping("/producto")
    @ResponseBody
    public String producto(){
        return "Hola producto";
    }
    
    @RequestMapping("/count")
    @ResponseBody
    public String count(){
        return "Tengo" + String.valueOf(productoRepository.count()) + "productos.";
    }

}