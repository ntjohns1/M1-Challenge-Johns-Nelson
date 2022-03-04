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
        this.plowing = true;
        this.harvesting = true;
        System.out.format("%s is plowing", this.getName());

    }

    public void harvest() {
        this.harvesting = true;
        System.out.format("%s is harvesting", this.getName());
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
