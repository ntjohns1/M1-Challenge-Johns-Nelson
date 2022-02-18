package com.company;

public class Constable extends Character {

    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(Character enemy) {
        System.out.format("Hey %s! Halt! You're under arrest%n", enemy.getName());
        enemy.setArrested(true);
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
