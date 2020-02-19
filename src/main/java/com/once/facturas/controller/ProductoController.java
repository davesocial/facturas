package com.once.facturas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ProductoController
 */
@Controller
public class ProductoController {

    @RequestMapping("/producto")
    @ResponseBody
    public String producto(){
        return "Hola producto";
    }
    
}