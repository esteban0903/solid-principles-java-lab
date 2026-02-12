package com.example.solid.ocp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OcpTest {
    @Test
    void regularDiscountIsTenPercent() {
        RegularDiscountStrategy strategy = new RegularDiscountStrategy();

        double discount = strategy.calculateDiscount(200.0);

        assertEquals(20.0, discount, 0.0001);
    }

    @Test
    void vipDiscountIsTwentyPercent() {
        VipDiscountStrategy strategy = new VipDiscountStrategy();

        double discount = strategy.calculateDiscount(200.0);

        assertEquals(40.0, discount, 0.0001);
    }
}
