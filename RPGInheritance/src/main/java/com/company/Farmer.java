package com.company;

public class Farmer extends Character {
    boolean plowing;
    boolean harvesting;

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
        this.plowing = false;
        this.harvesting = false;
    }

    public void plow() {
        System.out.println(this.getName() + " is plowing");
    }

    public void harvest() {
        System.out.println(this.getName() + " is harvesting");
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }
}
