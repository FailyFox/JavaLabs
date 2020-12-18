package com.droids;

public class Droid {
    protected String name;
    protected int health;
    protected boolean healer;

    public Droid() {}

    public boolean isAlive() { return health > 0; }

    @Override
    public String toString() {
        return name + ", health = " + health;
    }

    public void action(Droid target) { }
    public boolean isHealer() { return healer; }
}