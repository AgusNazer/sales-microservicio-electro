package com.agusdev.sales.Dto;

import java.math.BigDecimal;

public class SalesDto {

    private Long cartId;
    private double total;

    // Getters and Setters
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
