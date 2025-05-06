package com.agusdev.sales.repository;

import com.agusdev.sales.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {

}