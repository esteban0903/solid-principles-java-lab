package com.example.solid.isp;

import com.example.solid.isp.interfaces.Workable;

public class Developer implements Workable {
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }
}
