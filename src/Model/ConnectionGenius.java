package Model;

import java.net.InetAddress;

public class ConnectionGenius {

  InetAddress ipa;
  
  public ConnectionGenius(InetAddress ipa) {
    this.ipa = ipa;
  }

  public void fireUpGame() {
    prepareGameEnvironment();
    awayWeGo();
  }
  
  private void prepareGameEnvironment() {
    downloadWebVersion();
    connectToWebService();
  }

  private void downloadWebVersion(){
    System.out.println("Getting specialised web version.");
    System.out.println("Wait a couple of moments");  
  }
  
  private void connectToWebService() {
    System.out.println("Connecting");
  }
  
  public void awayWeGo(){
    System.out.println("Ready to play");
  }
}
