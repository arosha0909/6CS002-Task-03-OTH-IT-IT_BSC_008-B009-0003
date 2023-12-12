package Controller;

import java.io.IOException;

import Model.Main;
import View.WelcomePage;


public class GameController {
	private Main game;

    public GameController(Main game) {
        this.game = game;
    }

    public void startGame() throws IOException, Exception {
        game.run();
    }
}
