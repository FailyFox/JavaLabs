package depo;

import depo.controller.Train;
import depo.command.MainMenu;
import depo.model.CoveredWagon;
import depo.model.OpenWagon;
import depo.model.HopperWagon;
import depo.model.TankWagon;

import java.util.Scanner;

public class Main
{
    public static Train train = new Train();

    public static void main( String[] args ){
        MainMenu menu = new MainMenu();

        while(true){
            System.out.println("\nInput number of command (0 to see all commands)");
            menu.execute(new Scanner(System.in).nextInt());
        }
    }
}