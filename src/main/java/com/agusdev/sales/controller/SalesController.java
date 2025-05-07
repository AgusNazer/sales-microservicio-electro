package com.agusdev.sales.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.agusdev.sales.model.Sales;
import com.agusdev.sales.service.IServiceSales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.agusdev.sales.Dto.SalesDto;

import java.util.List;

@RestController
@RequestMapping("/sales")
//Swagger
@Tag(name = "Sales", description = "API for managing sales")
public class SalesController {

    @Autowired
    private IServiceSales serviceSales;

    @PostMapping
    public Sales createSale(@RequestBody SalesDto salesDto) {
        // Llamamos al servicio con el SalesDto
        return serviceSales.createSale(salesDto);
    }

    @GetMapping
    public List<Sales> getAllSales() {
        return serviceSales.getAllSales();
    }

    @GetMapping("/{id}")
    public Sales getSaleById(@PathVariable Long id) {
        return serviceSales.getSaleById(id);
    }
}
