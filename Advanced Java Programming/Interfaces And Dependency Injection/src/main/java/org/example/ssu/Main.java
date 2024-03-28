package org.example.ssu;

import org.example.ssu.classes.AdvancedNamedHuman;
import org.example.ssu.classes.BasicHuman;
import org.example.ssu.classes.NamedHuman;
import org.example.ssu.interfaces.Human;

public class Main {
    public static void main(String[] args) {
        BasicHuman basicHuman = new BasicHuman();
        NamedHuman namedHuman = new NamedHuman();
        AdvancedNamedHuman advancedNamedHuman = new AdvancedNamedHuman();

        Human human = basicHuman;
        human.doAllAction();

        human = namedHuman;
        human.doAllAction();

        human = advancedNamedHuman;
        human.doAllAction();
    }
}