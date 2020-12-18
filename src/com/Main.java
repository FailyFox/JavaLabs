package com;

import com.droids.Droid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Droid> team1 =  new ArrayList<>();
        List<Droid> team2 =  new ArrayList<>();
        Battle teamBattle = new Battle(team1, team2);

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        commands();

        System.out.println();
        while(true){
            System.out.print("Enter menu command: ");

            switch (scanner.nextInt()){
                case 0: commands(); break;
                case 1: menu.createDroid(); break;
                case 2: menu.showFreeDroids(); break;
                case 3:
                    System.out.print("Enter droid index: ");
                    menu.addDroidToTeam(scanner.nextInt(), team1); break;
                case 4:
                    System.out.print("Enter droid index: ");
                    menu.addDroidToTeam(scanner.nextInt(), team2); break;
                case 5: menu.showTeam(team1); break;
                case 6: menu.showTeam(team2); break;
                case 7: menu.startFight(teamBattle); break;
                case 8: return;
                default: System.out.println("Wrong input!");
            }
        }
    }
    public static void commands() {
        System.out.println("\n0: show commands");
        System.out.println("1: create new droid");
        System.out.println("2: show available droids");
        System.out.println("3: add droid to team 1");
        System.out.println("4: add droid to team 2");
        System.out.println("5: show first team");
        System.out.println("6: show second team");
        System.out.println("7: start fight");
        System.out.println("8: exit\n");
    }
}