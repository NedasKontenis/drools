package org.drools.examples.army;

public class ArmyRole {
    private String name;
    private Person person;

    public ArmyRole(String name, Person person) {
        this.name = name;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ArmyRole{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
