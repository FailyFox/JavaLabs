package depo.command;

public class Exit implements MenuItem {
    @Override
    public void execute() {
        System.exit(0);
    }
}
