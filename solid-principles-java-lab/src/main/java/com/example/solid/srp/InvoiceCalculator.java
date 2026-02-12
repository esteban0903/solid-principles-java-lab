package com.example.solid.srp;
public class InvoiceCalculator {
    public double calculateTotal(Invoice invoice) {
        return invoice.getAmount() * 1.21;
    }
}
