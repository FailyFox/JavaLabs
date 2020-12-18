package com;
import com.droids.*;
import java.util.List;
import java.util.Random;

import static com.colors.Colors.*;

public class Battle {

    List<Droid> team1;
    List<Droid> team2;
    List<Droid> assaultTeam;
    List<Droid> targetTeam;

    public Battle(List<Droid> team1, List<Droid> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    public void teamFight() {
            int round = 1;
            do{
                System.out.println( "\n----------" +
                                    "\nRound " + round++);
                pickAttackerTeam();
                for(Droid attacker : assaultTeam){
                    if (!isTeamAlive(targetTeam))
                        break;
                    if(attacker.isHealer())
                        attacker.action(pickTargetInTeam(assaultTeam));
                    else
                        attacker.action(pickTargetInTeam(targetTeam));
                    removeCorpse();
                }

                System.out.println(assaultTeam.toString());
                System.out.println(targetTeam.toString());


            } while (isTeamAlive(targetTeam));
            System.out.println(ANSI_GREEN + "\n\n"+assaultTeam.toString() + " won" + ANSI_RESET);
    }
    private void pickAttackerTeam(){
        if (new Random().nextBoolean()){
            assaultTeam = team1;
            targetTeam = team2;
        } else {
            targetTeam = team1;
            assaultTeam = team2;
        }
    }
    private boolean isTeamAlive(List<Droid> team){
        for(Droid droid : team)
            if (droid.isAlive())
                return true;
        return false;
    }
    private void removeCorpse(){ targetTeam.removeIf(droid -> !droid.isAlive()); }
    private Droid pickTargetInTeam(List<Droid> target){ return target.get(new Random().nextInt(target.size())); }
}