package depo.command;

import static depo.Main.train;

public class SortWagonsByPayload implements MenuItem {
    @Override
    public void execute() {
        train.sortWagons();
    }
}
