package com.example.solid.isp;

import com.example.solid.isp.interfaces.Eatable;
import com.example.solid.isp.interfaces.Workable;

public class Worker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Trabajando...");
    }

    @Override
    public void eat() {
        System.out.println("Almorzando...");
    }
}
