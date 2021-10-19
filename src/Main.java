import java.util.Scanner;
import java.math.*;
import java.time.LocalTime;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
//TODO: add stat roller, add background and name, add value checks, add player export
    public static void main(String[] args) {
        //initializations
        Scanner input = new Scanner(System.in);
        int str;
        int dex;
        int con;
        int wis;
        int intl;
        int cha;

        //Dice properties TODO: move all of this into new dice class with roll(d20) methods ect ect

        //LocalTime for dice roll calls
        LocalTime time = LocalTime.now();

        //d20
        int dTwentyMin = 1;
        int dTwentyMax = 20;
        int dTwentyRoll = ThreadLocalRandom.current().nextInt(dTwentyMin,dTwentyMax+1);

        //d12
        int dTwelveMin = 1;
        int dTwelveMax = 12;
        int dTwelveRoll = ThreadLocalRandom.current().nextInt(dTwelveMin,dTwelveMax+1);

        //d10
        int dTenMin = 1;
        int dTenMax = 10;
        int dTenRoll = ThreadLocalRandom.current().nextInt(dTenMin,dTenMax+1);

        //d8
        int dEightMin = 1;
        int dEightMax = 8;
        int dEightRoll = ThreadLocalRandom.current().nextInt(dEightMin,dEightMax+1);

        //d6
        int dSixMin = 1;
        int dSixMax = 6;
        int dSixRoll = ThreadLocalRandom.current().nextInt(dSixMin,dSixMax+1);

        //d4
        int dFourMin = 1;
        int dFourMax = 4;
        int dFourRoll = ThreadLocalRandom.current().nextInt(dFourMin,dFourMax+1);

        //Statblock generation TODO: Store these in array , also store roll values and ask player what value to bestow where, show what values are left

        //Strength
        System.out.println("Enter your strength >> ");
        str = input.nextInt();
        int strMod= ((str-10)/2);
        //If statement required for issues with Math.floor not working as expected for negative numbers
            if (str < 10)
                strMod=(str-11)/2;

        //Dexterity
        System.out.println("Enter your dexterity >> ");
        dex = input.nextInt();
        int dexMod=(dex-10)/2;
            if (dex < 10)
                dexMod=(dex-11)/2;

        //Constitution
        System.out.println("Enter your constitution >> ");
        con = input.nextInt();
        int conMod=(con-10)/2;
        if (con < 10)
            conMod=(con-11)/2;

        //Wisdom
        System.out.println("Enter your wisdom >> ");
        wis = input.nextInt();
        int wisMod=(wis-10)/2;
        if (wis < 10)
            wisMod=(wis-11)/2;

        //Intelligence
        System.out.println("Enter your intelligence >> ");
        intl = input.nextInt();
        int intlMod=(intl-10)/2;
            if (intl < 10)
                intlMod=(intl-11)/2;

        //Charisma
        System.out.println("Enter your charisma >> ");
        cha = input.nextInt();
        int chaMod=(cha-10)/2;
            if (cha < 10)
                chaMod=(cha-11)/2;

        //Proficiency
        System.out.println("Enter your proficiency bonus >> ");
        int prof= input.nextInt();
        //TODO: Saving Throws
        //TODO: Skills
        //TODO: Passive perception




        //Outputs post data Collection TODO: output skills/saves/proficiency/passive perception
        System.out.printf("%-14s%-6s%-6s\n","Stat","Score","Modifier");
        System.out.printf("%-14s%-6s%-6s\n","Strength",str,strMod);
        System.out.printf("%-14s%-6s%-6s\n","Dexterity",dex,dexMod);
        System.out.printf("%-14s%-6s%-6s\n","Constitution",con,conMod);
        System.out.printf("%-14s%-6s%-6s\n","Intelligence",intl,intlMod);
        System.out.printf("%-14s%-6s%-6s\n","Wisdom",wis,wisMod);
        System.out.printf("%-14s%-6s%-6s\n","Charisma",cha,chaMod);
        System.out.println("");
        System.out.println("Proficiency Bonus  +"+prof);
    }
}
