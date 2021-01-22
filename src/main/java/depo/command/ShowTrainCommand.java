package depo.command;

import static depo.Main.train;

public class ShowTrainCommand implements MenuItem {
    @Override
    public void execute() {
        train.showTrain();
    }
}
