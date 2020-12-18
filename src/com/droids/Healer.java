package com.droids;

import static com.colors.Colors.*;
import java.util.Random;

public class Healer extends Droid {
    private int addHP;

    public Healer(String name) {
        this.name = name;
        this.health = new Random().nextInt(51) + 20;
        this.healer = true;
    }
    @Override
    public void action(Droid target) {
        target.health += addHP;
        System.out.println(ANSI_GREEN + this.name + " healed " + target.name);
    }
}