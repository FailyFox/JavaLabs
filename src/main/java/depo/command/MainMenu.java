package depo.command;

import org.apache.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {
    public static final Logger log = Logger.getLogger(MainMenu.class);

    Map<Integer, MenuItem> items;

    public MainMenu() {

        log.info("Menu created");
        items = new LinkedHashMap<>();

        items.put(0, new Help());
        items.put(1, new AddWagon());
        items.put(2, new DeleteWagon());
        items.put(3, new getAmountOfPayload());
        items.put(4, new getAmountOfVolume());
        items.put(5, new SortWagonsByPayload());
        items.put(6, new ShowTrainCommand());
        items.put(9, new Exit());
    }

    public void execute(int command) {
        if (items.containsKey(command)) {
            log.info("Executing command: " + command);
            items.get(command).execute();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        log.info("Menu deleted");
        super.finalize();
    }
}