package com.example.tilerunner;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BoardGame extends Game {

    Player player;
    private ArrayList<Player> players;//
    private ArrayList<Player> winners;//

    @Override
    public void BeginningMessage() {

        System.out.println("Welcome to Tile Runner");

    }

    @Override
    public void EndMessage() {
        System.out.println("Thank you for playing");
    }

    public void setPlayers(String name) {
        this.players.add(new Player(name));
    }

    public void setPlayerNames(int n) {
        String name = "";
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("please enter a valid name for player " + (i + 1) + ": ");
            name = input.nextLine();
        }
        System.out.println("");
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }


    public int setNumOfPlayers() {
        Scanner input = new Scanner(System.in);
        int x = 1;
        String n = "";
        int num;
        System.out
                .print("Enter the # of players for your game – Number must be between and 4 only: ");
        while (true) {
            n = input.nextLine();

            // conditional statement to determine if the input is correct and to prompt the
            // user to input the right number if incorrect.
            Player p = new Player();
            if (p.isNotName(n)) {
                num = Integer.parseInt(n);
                if (num >= 2 && num <= 4) {
                    System.out.print("Give names");
                    break;
                }

            } else if (x < 3) {
                System.out.print("Bad Attempt " + x
                        + "Invalid # of players or input was not number. Please enter a # between 2 and 4 only:");

            }
            if (x == 3) {
                System.out.print("Bad Attempt " + x
                        + " Invalid # of players or input was not number. Please enter a # between 2 and 4 inclusively. This is your last attempt:");
            }
            if (x == 4) {

                System.out.println(
                        "Bad Attempt 4! You have used all the tries. Program will end ");
                System.exit(0);
            }
            x++;
        }

        System.out.println("");
        return num;
    }


    public int flipDice(int n) {
        Random rand = new Random();
        int num = 1 + rand.nextInt(n);
        return num;

    }

    public void whosFirst() {
        int x = 0; // iterates through the list of players
        int y = 6;// decrements the dice roll each time a player is chosen, so that whoever rolls
        // a 6 first is player 1, and whoever rolls a 5 is player 2...etc
        int num; // saves the dice roll.
        int order = 1; // increments the order of the players to display which player is in which
        // order.
        BoardGame boardgame = new BoardGame();
        ArrayList<Player> oldlist = this.getPlayers();
        ArrayList<Player> list = new ArrayList<Player>();
        System.out.println("We'll see who goes first");
        // while loop continues until all the players are set.
        while (true) {
            Player p = oldlist.get(x);
            Scanner input = new Scanner(System.in);
            System.out.println("Whoever rolls a " + y + " will be number " + order + ", " + oldlist.get(x).getName()
                    + " will roll now.");
            num = boardgame.flipDice(y);
            System.out.print("you rolled a " + num + "!");
            if (num == y) {
                System.out.println(" Congrats! " + oldlist.get(x).getName() + " is player " + order + "\n");
                list.add(p);
                oldlist.remove(p);
                y--;
                order++;
                x = 0;

            } else {
                System.out.println(" sorry! next turn.\n");
                x++;
                if (x == oldlist.size()) {
                    x = 0;
                }
            }

                    }
                }
            }
