package com.example.solid.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SrpTest {
    @Test
    void calculatesTotalWithTax() {
        Invoice invoice = new Invoice("Cliente", 100.0);
        InvoiceCalculator calculator = new InvoiceCalculator();

        double total = calculator.calculateTotal(invoice);

        assertEquals(121.0, total, 0.0001);
    }
}
