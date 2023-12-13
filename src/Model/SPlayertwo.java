public class SPlayertwo implements Strategy{
	
   @Override
   public void autoPlay() {
	   Aardvark aardvark = new Aardvark(2);
	   aardvark.playerName = "Level 2 Player";
	   aardvark.playGame();
   }
   
}