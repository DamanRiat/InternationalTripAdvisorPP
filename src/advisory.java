
/*
@ Author Damandeep Riat


 */


import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;

public class advisory {
    private static DecimalFormat round = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner UserBool= new Scanner(System.in);
        boolean choice = false;

        while (choice == false) {
              greeting();
             budgetTime();
            timeDifference();
            countryArea();
            System.out.println("Thank you for using the International Trip Advisor. ");
            System.out.print("Would you like to run the advisor again? \"Y\" for yes, \"N\" for no.");
            Character UserChoice = new Character(UserBool.next().charAt(0));

            if (UserChoice.equals('N')){
                choice = true;

            }



        }

    }

    public static void greeting() {
        Scanner user = new Scanner(System.in);

        System.out.println("Welcome to the Vacation Planner!!");
        System.out.print("What is your name? ");
        String name = user.nextLine();
        System.out.print("It is nice to meet you " + name + "," + " where are you traveling to? ");
        name = user.nextLine();
        System.out.println("Great! " + name + " " + "sounds like a great trip!");
        System.out.println("**************");


    }

    public static void budgetTime() {
        Scanner user1 = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int days = user1.nextInt();
        System.out.print("How much money, in USD, do you plan to spend on your trip? ");
        int TotalMoney = user1.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = user1.next();
        System.out.print("How many " + currency + " are there in 1 USD ? ");
        double conversion = user1.nextDouble();

        System.out.println();
        int hours = days * 24;
        int minutes = hours * 60;
        double DailyBudget = TotalMoney / days;
        double TotalBudgetForeign = conversion * TotalMoney;
        double BudgetForeignPerDay = TotalBudgetForeign / days;

        System.out.println("If you are traveling for " + days + " days, " + " that is the same as " + hours + " hours " + "or " + minutes + " minutes. ");
        System.out.println("If you are going to spend " + "$" + TotalMoney + " USD" + " that means per day you can spend up to " + "$" + DailyBudget + " USD.");
        System.out.println("Your total budget in " + currency + " is " + round.format(TotalBudgetForeign) + " " + currency + "," + " which per day is " + round.format(BudgetForeignPerDay) + " " + currency);
        System.out.println("**************");
        System.out.println();


    }

    public static void timeDifference() {
        Scanner user2 = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? (USE NEGATIVE FOR TIME ZONES BEHIND YOUR HOME TIME) ");
        int HoursTimeDifference = user2.nextInt();
        int ClockTimeMid = 0;
        int ClockTimeNoon = 12;
        ClockTimeMid = HoursTimeDifference % 12;
        ClockTimeNoon = 12 + (HoursTimeDifference % 12);
        if (ClockTimeMid < 0) {
            ClockTimeMid = 12 + ClockTimeMid;
        }
        System.out.println("That means when it is midnight at home it will be " + ClockTimeMid + ":00 at your travel destination ");
        System.out.println("and when it is noon it will be " + ClockTimeMid + ":00");
        System.out.println("**************");
        System.out.println();


    }

    public static void countryArea() {
        Scanner user3 = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km^2? ");
        double AreaKm2 = user3.nextDouble();
        double ConversionToMiles2 = AreaKm2 / 2.59;
        System.out.println("In miles that is " + round.format(ConversionToMiles2) + " miles^2. ");
        System.out.println("**************");
        System.out.println();


    }
}
