package Controller;

import java.io.IOException;

import Model.Subject;
import View.LoadingPage;


public class MainController implements Observer {
	private Subject game;

    public MainController(Subject game) {
        this.game = game;
    }

    @Override
	public void Begin() throws IOException, Exception {
        game.run();
    }
}
