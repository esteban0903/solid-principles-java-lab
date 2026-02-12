package com.example.solid.lsp;

import com.example.solid.lsp.interfaces.Drivable;
import com.example.solid.lsp.interfaces.Rechargeable;

public class ElectricCar implements Drivable, Rechargeable {

    @Override
    public void drive() {
        System.out.println("Conduciendo carro eléctrico...");
    }

    @Override
    public void recharge() {
        System.out.println("Recargando batería...");
    }
}
