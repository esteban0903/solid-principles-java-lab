package com.example.solid.isp;

import com.example.solid.isp.interfaces.Eatable;
import com.example.solid.isp.interfaces.Workable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class IspTest {
    @Test
    void developerShouldWork() {
        Workable developer = new Developer();
        assertDoesNotThrow(developer::work);
    }

    @Test
    void workerShouldWork() {
        Workable worker = new Worker();
        assertDoesNotThrow(worker::work);
    }

    @Test
    void workerShouldEat() {
        Eatable worker = new Worker();
        assertDoesNotThrow(worker::eat);
    }
}
