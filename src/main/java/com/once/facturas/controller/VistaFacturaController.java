package com.once.facturas.controller;

import com.once.facturas.model.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * VistaFacturaController
 */
@Controller
@RequestMapping (value = "/productos")
public class VistaFacturaController {
    
    @Autowired
    ProductoRepository productoRepository;
    
}