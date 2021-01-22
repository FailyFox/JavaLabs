package depo.command;

import depo.model.CoveredWagon;
import depo.model.OpenWagon;
import depo.model.HopperWagon;
import depo.model.TankWagon;

import java.util.Scanner;

import static depo.Main.train;

public class AddWagon implements MenuItem {
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        int id;

        System.out.print("\nEnter wagon ID: ");
        id = scan.nextInt();

        System.out.println("1 - covered");
        System.out.println("2 - open");
        System.out.println("3 - tank");
        System.out.println("4 - hopper");

        int key = 0;

        while(key < 1 || key > 4){
            System.out.println("Enter wagon type: ");
            key = scan.nextInt();
        }

        switch (key){
            case 1:
                train.addWagon(new CoveredWagon(id));
                break;
            case 2:
                train.addWagon(new OpenWagon(id));
                break;
            case 3:
                train.addWagon(new TankWagon(id));
                break;
            case 4:
                train.addWagon(new HopperWagon(id));
                break;
            default:
                System.out.println("Wrong symbol");
        }
    }
}