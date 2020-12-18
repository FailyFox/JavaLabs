package com;

import com.droids.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Droid> freeDroids = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Menu(){ }

    public void createDroid(){
        String name;
        System.out.println("\n New droid");
        System.out.print(" Name: ");
        name = scan.nextLine();
        scan.nextLine();
        System.out.println("Select droid type: \n 1 - Damager\n 2 - Healer");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                freeDroids.add(new Damager(name));
                break;
            case 2:
                freeDroids.add(new Healer(name));
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
    }

    public void showFreeDroids(){
        for(int i = 0; i < freeDroids.size(); i++)
            System.out.println("\n ["+i+"] " + freeDroids.get(i).toString() + "\n");
    }
    public void showTeam(List<Droid> team){
        for(Droid droid : team)
            System.out.println("\n" + droid.toString() + "\n");
    }

    public void addDroidToTeam(int index, List<Droid> team){
        team.add(freeDroids.get(index));
        freeDroids.remove(freeDroids.get(index));
    }

    public void startFight(Battle teamBattle){ teamBattle.teamFight(); }
}
