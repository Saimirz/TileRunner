package com.example.tilerunner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("My First App");
        primaryStage.setMinHeight(800);
        primaryStage.setMinWidth(800);
        primaryStage.setMaxHeight(800);
        primaryStage.setMaxWidth(800);
        Board board = new Board();
        BoardGame boardgame = new BoardGame();
        Player pl = new Player();
        VBox side = new VBox();
        Label noPlayers = new Label();
        Label PlayerTurn = new Label();



        HBox root1 = new HBox();
        Group group = new Group();

        root1.getChildren().addAll(side, group);


        Scene scene = new Scene(root1);

        noPlayers.setText("number of players :  " + boardgame.getPlayers());
        PlayerTurn.setText("it is this players turn" + boardgame.player );

        root1.getChildren().add(board.makeBoard());



        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}