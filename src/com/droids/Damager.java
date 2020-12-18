package com.droids;
import java.util.Random;

import static com.colors.Colors.*;

public class Damager extends Droid {
    private final int damage;
    private final int accuracy;

    public Damager(String name) {
        this.name = name;
        this.health = new Random().nextInt(101) + 20;
        this.damage = new Random().nextInt(21) + 5;
        this.accuracy = new Random().nextInt(71) + 25;
        this.healer = false;
    }

    @Override
    public void action(Droid target) {
        if(new Random().nextInt(101) > accuracy)
            System.out.println(ANSI_YELLOW + this.name + " missed hit" + ANSI_RESET);
        else {
            target.health -= this.damage;
            System.out.println(ANSI_RED + this.name + " hit " + target.name + ANSI_RESET);
        }
    }
}
