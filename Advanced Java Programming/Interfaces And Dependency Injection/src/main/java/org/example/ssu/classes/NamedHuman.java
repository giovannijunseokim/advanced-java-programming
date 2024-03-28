package org.example.ssu.classes;

import org.example.ssu.interfaces.Human;

public class NamedHuman implements Human {
    String name = "Junseo Kim";

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

    @Override
    public void introduce() {
        System.out.printf("Hello, I’m %s \n", this.name);
    }
}
