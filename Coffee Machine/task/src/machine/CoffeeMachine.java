package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int initialWater=400;
    static int initialMilk=540;
    static int initialcoffeeBeans=120;
    static int initialcups=9;
    static int initialMoney=550;

    public static int checkWater(int water, int cupsNeeded){

        if(water>=cupsNeeded*200)
            return(water/(cupsNeeded*200));
        else
            return 0;
    }

    public static int checkMilk(int milk, int cupsNeeded){

        if(milk>=cupsNeeded*50)
            return (milk/(cupsNeeded*50));
        else
            return 0;
    }

    public static int checkCoffeeBean(int coffeeBean, int cupsNeeded){

        if(coffeeBean>=cupsNeeded*15)
            return (coffeeBean/(cupsNeeded*15));
        else
            return 0;
    }

    public static int findMin(int countOfWater, int countOfMilk, int countOfCoffee){

        int smallest=0;

        if(countOfWater<countOfMilk) {
            if(countOfCoffee<countOfWater) {
                smallest = countOfCoffee;
            } else {
                smallest = countOfWater;
            }
        } else {
            if(countOfMilk<countOfCoffee) {
                smallest = countOfMilk;
            } else {
                smallest = countOfCoffee;
            }

    }
        return smallest;

    }

    static void espresso(){
        initialWater=initialWater-250;
        initialcoffeeBeans=initialcoffeeBeans-16;
        initialMoney=initialMoney+4;
        initialcups=initialcups-1;

    }
    static void latte(){
        initialWater=initialWater-350;
        initialMilk=initialMilk-75;
        initialcoffeeBeans=initialcoffeeBeans-20;
        initialMoney=initialMoney+7;
        initialcups=initialcups-1;

    }
    static void cappuccino(){
        initialWater=initialWater-200;
        initialMilk=initialMilk-100;
        initialcoffeeBeans=initialcoffeeBeans-12;
        initialMoney=initialMoney+6;
        initialcups=initialcups-1;

    }

    static void fillMachine(int addWater, int addMilk, int addCoffeeBeans, int addCups){

        initialWater+=addWater;
        initialMilk+=addMilk;
        initialcoffeeBeans+=addCoffeeBeans;
        initialcups+=addCups;
    }

    static boolean  checkespresso(){

        if(initialWater<250) {
            System.out.println("Sorry, not enough water!");
        } else if(initialcoffeeBeans<16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(initialWater>=250 && initialcoffeeBeans>=16){
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        }
        return false;
    }
    static boolean  checkcappucino(){

        if(initialWater<200) {
            System.out.println("Sorry, not enough water!");
        }  else if(initialMilk<100) {
            System.out.println("Sorry, not enough milk!");
        }else if(initialcoffeeBeans<12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(initialWater>=200 && initialcoffeeBeans>=12 && initialMilk>=100){
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        }
        return false;
    }
    static boolean  checklatte(){

        if(initialWater<350) {
            System.out.println("Sorry, not enough water!");
        }else if(initialMilk<75) {
            System.out.println("Sorry, not enough milk!");
        } else if(initialcoffeeBeans<20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if(initialWater>=350 && initialcoffeeBeans>=20 && initialMilk>=75){
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

       /* System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");*/

       /* System.out.println("Write how many cups of coffee you will need:");
        int numberOfCups=sc.nextInt();
        System.out.println("For "+ numberOfCups+ " cups of coffee you will need:");*/

      /*  int water=numberOfCups*200;
        int milk=numberOfCups*50;
        int coffeeBeans= numberOfCups*15;*/

       /* System.out.println(water+ " ml of water");
        System.out.println(milk+ " ml of milk");
        System.out.println(coffeeBeans+ " g of coffee beans");*/

      /*  System.out.println("Write how many ml of water the coffee machine has:");
        int availableWater=sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int availableMilk=sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int availableCoffeeBean=sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsNeeded=sc.nextInt();

        int countOfWater=checkWater(availableWater,cupsNeeded);
        int countOfMilk=checkMilk(availableMilk,cupsNeeded);
        int countOfCoffee=checkCoffeeBean(availableCoffeeBean,cupsNeeded);

        int minimum= findMin(countOfWater,countOfMilk,countOfCoffee);

        int noOfCups=0;
        if(minimum==0) {
            noOfCups=findMin((availableWater/200),(availableMilk/50),(availableCoffeeBean/15));
        }
        int extra=0;

        if(minimum==cupsNeeded && minimum!=0)
            System.out.println("Yes, I can make that amount of coffee");
        else if(minimum>cupsNeeded){
            extra=minimum-cupsNeeded;
            System.out.println("Yes, I can make that amount of coffee (and even "+ extra+ " more than that)");

        }else if(minimum!=0)
            System.out.println("No, I can make only "+minimum+ " cup(s) of coffee");
        else
            System.out.println("No, I can make only "+noOfCups+ " cup(s) of coffee");
*/


        /*System.out.println("The coffee machine has:\n400 ml of water\n" +
                "540 ml of milk\n" +
                "120 g of coffee beans\n" +
                "9 disposable cups\n" +
                "$550 of money");*/


        String option;
        String choice;
        int addWater=0;
        int addMilk=0;
        int addCoffeeBeans=0;
        int addCups=0;
        int flag=0;
        while(flag==0) {

            System.out.println("Write action (buy, fill, remaining, take, exit):");
             choice = sc.next();
            switch (choice) {

                case "buy": {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte,\n" +
                            " 3 - cappuccino, back - to main menu:");
                    option = sc.next();
                    switch (option) {
                        case "1": {
                            if(checkespresso())
                                espresso();

                            break;
                        }
                        case "2": {
                            if(checklatte())
                                latte();

                            break;
                        }
                        case "3": {
                            if(checkcappucino())
                                cappuccino();

                            break;
                        }
                        case "back": {
                            break;
                        }
                        default: {
                            System.out.println("Enter correct option1!");
                        }
                    }
                        break;

                }
                case "fill": {
                    System.out.println("Write how many ml of water you want to add:");
                    addWater = sc.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    addMilk = sc.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    addCoffeeBeans = sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    addCups = sc.nextInt();

                    fillMachine(addWater, addMilk, addCoffeeBeans, addCups);

                    break;

                }
                case "remaining": {
                    System.out.println("The coffee machine has:\n" +
                            initialWater+" ml of water\n" +
                            initialMilk+" ml of milk\n" +
                            initialcoffeeBeans+" g of coffee beans\n" +
                            initialcups+" disposable cups\n" +
                            "$"+initialMoney+" of money");

                        break;
                }
                case "take": {
                    System.out.println("I gave you $" + initialMoney);
                    initialMoney = 0;

                    break;
                }
                case "exit": {
                    flag = 1;
                    break;
                }
             /*   default:
                    System.out.println("Enter correct choice!");*/

            }
        }

    }
}
