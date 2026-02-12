package com.example.solid.ocp;

import com.example.solid.ocp.strategy.DiscountStrategy;

public class RegularDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
