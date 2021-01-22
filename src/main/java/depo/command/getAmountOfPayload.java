package depo.command;

import static depo.Main.train;

public class getAmountOfPayload implements MenuItem {
    @Override
    public void execute() {
        System.out.println("Train payload: " + train.getPayload());
    }
}
