package Model;

public class SPlayerOne implements Strategy{
	
   @Override
   public void autoPlay() {
	   Aardvark aardvark = new Aardvark(1);
	   aardvark.playerName = "Level 1 Player";
	   aardvark.playGame();
   }   
}