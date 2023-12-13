
public class SRun {

	public static void main(String[] args) {
	      SContext sContext = new SContext(new SPlayerOne());		
	      sContext.executeStrategy();

	      sContext = new SContext(new SPlayertwo());		
	      sContext.executeStrategy();

	      sContext = new SContext(new SPlayerthree());		
	      sContext.executeStrategy();
	   }
	
}
