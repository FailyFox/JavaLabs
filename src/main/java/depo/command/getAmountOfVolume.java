package depo.command;

import static depo.Main.train;

public class getAmountOfVolume implements MenuItem {
    @Override
    public void execute() {
        System.out.println("Train volume: " + train.getVolume());
    }
}
