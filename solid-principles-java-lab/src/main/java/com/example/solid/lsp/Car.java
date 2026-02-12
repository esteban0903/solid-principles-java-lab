package com.example.solid.lsp;

import com.example.solid.lsp.interfaces.Drivable;
import com.example.solid.lsp.interfaces.Refuelable;

public class Car implements Drivable, Refuelable {

    @Override
    public void drive() {
        System.out.println("Conduciendo carro de gasolina...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}
