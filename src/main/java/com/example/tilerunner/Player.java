package com.example.tilerunner;

import java.util.Scanner;

public class Player {

    private String name;//player name.
    private int position;//player position on the board.


     // player constructor without parameters.

    public Player() {
        this.name = "";
        this.position = 0;
    }


     //  The parameter name sets the name of the player.

    public Player(String name) {
        this.name = name;
        this.position = 0;
    }


    //  this sets the name of a player that has already been declared by a paramenterless constructor.

     //  Here parameter name sets the name

    public void setName(String name) {
        this.name = name;
    }


      //Returns the name of the player


    public String getName() {
        return this.name;
    }


      //Returns player position.

    public int getPosition() {
        return this.position;
    }


      //advances the player by the amount of num.

      // the num parameter is used to determine how much to advance the player by.

    public void advance(int num) {

        this.position += num;

    }


      //To set the players position to an arbitrary number predetermined by another method.

      //the parameter n will be the new position to be set.

    public void setPosition(int n) {
        this.position = n;
    }




     // returns the first letter of a player and will be used to represent their position on the board.

    public char getChar() {
        return Character.toUpperCase(this.getName().charAt(0));
    }


      //A basic toString method to return the name of the player.

    public String toString() {
        return this.name;
    }


    public boolean isNotName(String n) {

            Integer.parseInt(name);
            return true;

        }
    }





