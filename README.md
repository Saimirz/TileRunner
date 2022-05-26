# TileRunner
Java 2 Final Project

Welcome to Tile Runner. A game created by Saif-ur-Rahman Mirza

Race against your friends to see who can reach the end in a game based solely on chance!

The application unfortunately isn't working how I intended it to work, it only displays the game board. The way I wanted it to work was so that we can click an add button which would add the players to the board. At the top left of the board, it would then display how many players were added. It would then ask to set names for the players and on the tile 0, it would display the first letter of the names. Then to see who rolls first, you would roll the dice, and it would check who got a 6 first, then that person would go first, then a 5 and that person would go second etc. The players first letters would move across the board in a race to see who would reach the end first.

To build the board, a gridpane was used to create a 10x10 gridpane with 100 squares. Simple methods like setters, getters, toString etc were used to create some of the basic components of the game.

I faced many challenges. I couldn't figure out how to set the players to the board, and how to get them to actually move around. I believe I managed to correctly do my user stories. Overall, i could not get the things i wanted to display, to display. The alignment and everything is off. Im hoping that next time, I will actually be able to achieve this.

I have created 4 classes and 1 interface. Player, BoardGame, Game and board. The class board is what deals with the creation of the board itself.  The player class deals with all the player related things, like the names and the positions. The BoardGame class focuses on the board game itself and the implementations of the userstories and all the mechanisms the game requires to be what it is. And the Game class is an abstract class which holds two undefined methods that give beginning and ending messages in the game. The aggregation occurs in BoardGame with players, because a board game has a players and inheritance through Game because a boargame is a game.

UML CLASS:
![UML class java](https://user-images.githubusercontent.com/106036032/170408230-ddbe27dd-7bee-425f-8819-0454e90a19d8.png)

Screenshots of Application
![image](https://user-images.githubusercontent.com/106036032/170408466-b71a644a-d6be-4274-a8f2-8bf76937c2a3.png)





