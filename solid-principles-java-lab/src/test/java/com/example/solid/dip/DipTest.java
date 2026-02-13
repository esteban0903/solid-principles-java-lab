package com.example.solid.dip;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DipTest {
    @Test
    void processorUsesInjectedDatabase() {
        InMemoryDatabase database = new InMemoryDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        processor.processOrder();

        assertTrue(database.wasSaved());
    }

    private static class InMemoryDatabase implements Database {
        private boolean saved;

        @Override
        public void saveOrder() {
            saved = true;
        }

        private boolean wasSaved() {
            return saved;
        }
    }
}
