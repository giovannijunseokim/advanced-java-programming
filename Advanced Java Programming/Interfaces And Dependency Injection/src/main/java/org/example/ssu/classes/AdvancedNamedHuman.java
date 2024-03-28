package org.example.ssu.classes;

import org.example.ssu.interfaces.Human;

public class AdvancedNamedHuman implements Human {
    String name = "Junseo Kim";

    @Override
    public void wakeUp() {
        System.out.println(this.name + " wakeUp invoked...");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat invoked...");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " walk invoked...");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " sleep invoked...");
    }

    @Override
    public void introduce() {
        System.out.printf("Hello, I’m %s \n", this.name);
    }
}
