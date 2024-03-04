package org.drools.examples.army;

public class Person {
    private String name;
    private int age;
    private boolean isHealthy;
    private boolean isVolunteer;
    private boolean isEnlisted = false;
    private boolean isEngineer;
    private MilitaryBase assignedBase;

    public Person() {
    }

    public Person(String name, int age, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
        this.isEnlisted = false;
    }

    public Person(String name, int age, boolean isHealthy, boolean isVolunteer) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
        this.isVolunteer = isVolunteer;
    }

    public Person(String name, int age, boolean isHealthy, boolean isVolunteer, boolean isEngineer) {
        this.name = name;
        this.age = age;
        this.isHealthy = isHealthy;
        this.isVolunteer = isVolunteer;
        this.isEngineer = isEngineer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        this.isHealthy = healthy;
    }

    public boolean isEnlisted() {
        return isEnlisted;
    }

    public void setEnlisted(boolean enlisted) {
        this.isEnlisted = enlisted;
    }

    public boolean isEngineer() {
        return isEngineer;
    }

    public void setEngineer(boolean engineer) {
        isEngineer = engineer;
    }

    public MilitaryBase getAssignedBase() {
        return assignedBase;
    }

    public void setAssignedBase(MilitaryBase assignedBase) {
        this.assignedBase = assignedBase;
    }

    public boolean isVolunteer() {
        return isVolunteer;
    }

    public void setVolunteer(boolean volunteer) {
        isVolunteer = volunteer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHealthy=" + isHealthy +
                ", isVolunteer=" + isVolunteer +
                ", isEnlisted=" + isEnlisted +
                ", isEngineer=" + isEngineer +
                ", assignedBase=" + (assignedBase != null ? assignedBase.getName() : "None") +
                '}';
    }
}