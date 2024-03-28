package org.example.ssu.interfaces;

import java.util.List;

public interface Human {

    List<String> mammals = List.of("", "");

    void wakeUp();

    default void introduce() {
        System.out.println("Hello, I’m human");
    }

    void eat();

    void walk();

    void sleep();

    default void doAllAction() {
        this.wakeUp();
        this.introduce();
        this.eat();
        this.walk();
        this.sleep();
    }
}