package org.drools.examples.army;

public class ArmyExample {
    public static void main(String[] args) {
        Object[] persons = {
                new Person("John Doe", 31, true),
                new Person("Nedas Kontenis", 23, true),
                new Person("Light Yagami", 16, true),
                new Person("Dave Oak", 32, true, true),
                new Person("Robert James", 23, true, true, true),
        };

        new RuleRunner().runRules( new String[] { "Army.drl" },
                persons);
    }
}