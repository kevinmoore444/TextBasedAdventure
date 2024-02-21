package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Constants/Variables
        boolean hasSword = false;
        String location = "countryside";
        boolean deadCreature = false;
        int command;
        boolean continueGame = true;


        // Preface / Countryside
        System.out.println("“You are working in the fields. One day you receive word from the village that the " +
                "princess has been captured! You strengthen your resolve and set off to rescue the princess!”\n" +
                "“You see a single road that leads out of the countryside and toward the village.”\n");
        do {
            System.out.println("[1] Go East to Village: ");
            System.out.print("Select Number From Options: ");
            command = scanner.nextInt();
        } while(command != 1);
        location = "village";

        // Begin Game
        while(continueGame == true){
            //ENTERING THE VILLAGE
            switch(location){
                case "village":
                    System.out.println("\n“You arrive at the village. The Town Crier points you in the direction of the castle " +
                            "and recommends you gear up before confronting the dragon. He mentions the Forest to the North and " +
                            "the Mountains to the South as areas of possible interest that may aid you in your quest.”\n");
                    System.out.println("[1] Go North to Forest: ");
                    System.out.println("[2] Go South to Mountains: ");
                    System.out.println("[3] Go East to Castle: ");
                    System.out.print("Select Number From Options: ");
                    command = scanner.nextInt();
                        switch(command){
                            case 1:
                                location = "forest";
                                break;
                            case 2:
                                location = "mountains";
                                break;
                            case 3:
                                location = "castle";
                                break;
                            default:
                                System.out.println("This is not the location you're looking for.\n");
                                break;
                        }
                    break;
                case "mountains":
                    System.out.println("\n“You come to a mountain cliff overlooking a beautiful valley below. " +
                            "Gazing off into the distance, you fail to feel the ground beneath you breaking away. " +
                            "You stumble but fail to regain your footing and tumble down the mountainside. You have died.”\n");
                    continueGame = false;
                    break;
                case "forest":
                    System.out.println("\nYou enter the forest and meet a woodland creature. How do you proceed?\n");
                    System.out.println("[1] Return South to Village: ");
                    System.out.println("[2] Talk to Woodland Creature: ");
                    System.out.println("[3] Kill Woodland Creature: ");
                    System.out.print("Select Number From Options: ");
                    command = scanner.nextInt();
                    //ENTERING THE FOREST
                        switch(command){
                            case 1:
                                location = "village";
                                break;
                            case 2:
                                System.out.println("\n“Greetings traveler! I found this shiny object just laying around and have no need for it. " +
                                        "Perhaps it may be of use to you?” You take the sword and return to the village.\n");
                                System.out.println("");
                                location = "village";
                                hasSword = true;
                                break;
                            case 3:
                                System.out.println("\nThe creature waves its arms in front of its body, casting a magical enchantment on you. " +
                                        "Your body twitches uncontrollably before falling to the ground in a lifeless heap. You are dead.\n");
                                deadCreature = true;
                                continueGame = false;
                                break;
                            default:
                                System.out.println("\nThis is not the location you're looking for.\n");

                                break;
                        }
                    break;
                case "castle":
                    System.out.println("\nYou enter the castle and meet a mysterious dragon.");
                    System.out.println("[1] Try to fight the dragon ");
                    System.out.println("[2] Flee back to the village: ");
                    System.out.println("[3] Attempt to befriend the dragon: ");
                    System.out.print("Select Number From Options: ");
                    command = scanner.nextInt();

                    //ENTERING THE CASTLE
                        switch(command){
                            case 1:
                                if (hasSword == true){
                                    System.out.println("\nYou killed the dragon and won the game");
                                    continueGame = false;
                                }
                                else{
                                    System.out.println("\nThe dragon killed you.");
                                    continueGame = false;
                                }
                                break;
                            case 2:
                                System.out.println("\nYou fled the dragon in terror and returned to the village");
                                location = "village";
                                break;
                            case 3:
                                System.out.println("\n“You have a heart to heart with the dragon. Turns out the dragon is just misunderstood " +
                                        "and in search of friends so it wouldn’t be lonely. You agree to visit regularly in exchange for the princess’ freedom.”");
                                continueGame = false;
                                break;
                            default:
                                System.out.println("\nThis is not the location you're looking for.");
                                break;
                        }
                    break;
                default:
                    System.out.println("\nThis is not the location you're looking for.");
                    break;
                }
        }
        System.out.println("\nGAME OVER!!!!");

    }


}