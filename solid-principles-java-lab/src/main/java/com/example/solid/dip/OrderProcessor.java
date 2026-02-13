package com.example.solid.dip;

import java.util.Objects;

public class OrderProcessor {
    private final Database database;

    public OrderProcessor(Database database) {
        this.database = Objects.requireNonNull(database, "database");
    }

    public void processOrder() {
        System.out.println("Procesando pedido...");
        database.saveOrder();
    }
}
