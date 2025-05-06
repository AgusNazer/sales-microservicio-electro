package com.agusdev.sales.service;

import com.agusdev.sales.model.Sales;
import com.agusdev.sales.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceSales implements IServiceSales {

    @Autowired
    private SalesRepository salesRepository;

    @Override
    public Sales createSale(Sales sale) {
        // Lógica adicional si es necesario antes de guardar la venta
        return salesRepository.save(sale);
    }

    @Override
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    @Override
    public Sales getSaleById(Long id) {
        Optional<Sales> sale = salesRepository.findById(id);
        return sale.orElse(null);  // Retorna null si no se encuentra la venta
    }
}
