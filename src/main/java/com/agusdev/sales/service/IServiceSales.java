package com.agusdev.sales.service;

import com.agusdev.sales.model.Sales;
import java.util.List;

public interface IServiceSales {
    Sales createSale(Sales sale);
    List<Sales> getAllSales();
    Sales getSaleById(Long id);
}
