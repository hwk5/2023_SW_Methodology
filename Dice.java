package dice_game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.util.Random;

class Dice {
    private int number;

    public void roll() {
        Random random = new Random();
        number = random.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}