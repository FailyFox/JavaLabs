package depo.command;

import java.util.Scanner;

import static depo.Main.train;

public class DeleteWagon implements MenuItem {
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter wagon ID to delete: ");
        int id = scan.nextInt();
        if (train.delWagon(id)) {
            System.out.println("Wagon " + id + " deleted");
        } else {
            System.out.println("There is no wagon with ID " + id);
        }


    }
}
