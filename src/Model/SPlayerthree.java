public class SPlayerthree implements Strategy{
	
   @Override
   public void autoPlay() {
	   Aardvark aardvark = new Aardvark(3);
	   aardvark.playerName = "Level 3 Player";
	   aardvark.playGame();
   }
   
}