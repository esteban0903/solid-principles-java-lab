package com.example.solid.lsp;

import com.example.solid.lsp.interfaces.Drivable;
import com.example.solid.lsp.interfaces.Rechargeable;
import com.example.solid.lsp.interfaces.Refuelable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LcpTest {
    @Test
    void carShouldDrive() {
        Drivable car = new Car();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void electricCarShouldDrive() {
        Drivable car = new ElectricCar();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void carShouldRefuel() {
        Refuelable car = new Car();
        assertDoesNotThrow(car::refuel);
    }

    @Test
    void electricCarShouldRecharge() {
        Rechargeable car = new ElectricCar();
        assertDoesNotThrow(car::recharge);
    }
}
