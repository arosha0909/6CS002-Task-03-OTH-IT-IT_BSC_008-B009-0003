public class SContext {
   private Strategy strategy;

   public SContext(Strategy strategy){
      this.strategy = strategy;
   }

   public void executeStrategy(){
      strategy.autoPlay();
   }
}