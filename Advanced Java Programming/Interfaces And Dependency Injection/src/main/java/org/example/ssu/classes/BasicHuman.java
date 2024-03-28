package org.example.ssu.classes;

import org.example.ssu.interfaces.Human;

public class BasicHuman implements Human {
    @Override
    public void wakeUp() {
        System.out.println("wakeUp invoked...");
    }

    @Override
    public void eat() {
        System.out.println("eat invoked...");
    }

    @Override
    public void walk() {
        System.out.println("walk invoked...");
    }

    @Override
    public void sleep() {
        System.out.println("sleep invoked...");
    }
}
