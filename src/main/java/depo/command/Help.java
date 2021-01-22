package depo.command;

public class Help implements MenuItem {
    @Override
    public void execute() {
        System.out.println("Available commands: ");
        System.out.println("1 - add new wagon");
        System.out.println("2 - delete existing wagon");
        System.out.println("3 - show amount of payload in train");
        System.out.println("4 - show amount of volume in train");
        System.out.println("5 - sort wagons by payload");
        System.out.println("6 - show train");
        System.out.println("9 - exit");
        System.out.println();
    }
}
