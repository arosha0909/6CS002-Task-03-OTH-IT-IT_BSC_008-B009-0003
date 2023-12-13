package Model;

import java.awt.Graphics;
import java.io.IOException;

public interface Subject {

	void run() throws IOException, Exception;

	void drawDominoes(Graphics g);

	void drawGuesses(Graphics g);
	//__id

}