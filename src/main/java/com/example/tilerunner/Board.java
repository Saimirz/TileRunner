package com.example.tilerunner;

import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;


public class Board extends Pane {

// THIS WILL GENERATE THE BOARD FOR THE GAME
    public GridPane makeBoard(){
        GridPane gridpaneBoard = new GridPane();
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                Rectangle rect = new Rectangle(55, 55);
                rect.setStroke(Color.BLACK);

                rect.setFill((x + y) % 2 == 0 ? Color.WHITE : Color.BLACK);
                gridpaneBoard.setAlignment(Pos.CENTER);
                gridpaneBoard.add(rect, x, y);
            }
        }
        return gridpaneBoard;
    }



}
