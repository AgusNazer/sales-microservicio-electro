package com.agusdev.sales.service;

import com.agusdev.sales.model.Sales;
import com.agusdev.sales.Dto.SalesDto;
import com.agusdev.sales.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServiceSales implements IServiceSales {

    @Autowired
    private SalesRepository salesRepository;

    @Override
    public Sales createSale(SalesDto salesDto) {
        // Crear una instancia de Sales desde SalesDto
        Sales sale = new Sales();
        sale.setCartId(salesDto.getCartId());
        sale.setSaleDate(LocalDateTime.now());
        sale.setTotalAmount(BigDecimal.valueOf(salesDto.getTotal()));

        // Guardar la venta en la base de datos
        return salesRepository.save(sale); // Guardar el objeto `sale` correctamente
    }

    @Override
    public List<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    @Override
    public Sales getSaleById(Long id) {
        return salesRepository.findById(id).orElse(null); // Retorna null si no se encuentra la venta
    }
}
