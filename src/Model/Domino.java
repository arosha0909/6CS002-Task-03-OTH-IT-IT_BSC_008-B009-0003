package Model;


public class Domino implements Comparable<Domino> {
  public int high;
  public int low;
  public int hx;
  public int hy;
  public int lx;
  public int ly;
  public boolean placed = false;

  public Domino(int high, int low) {
    super();
    this.high = high;
    this.low = low;
  }
  
  public void place(int hx, int hy, int lx, int ly) {
    this.hx = hx;
    this.hy = hy;
    this.lx = lx;
    this.ly = ly;
    placed = true;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("[");
    result.append(convertToString(high));
    result.append(convertToString(low));
    result.append("]");
    if(!placed){
      result.append("unplaced");
    } else {
      result.append(formatPosition(hx, hy));
      result.append(formatPosition(lx, ly));
    }
    return result.toString();
  }

  private String convertToString(int number) {
    return Integer.toString(number);
  }

  private String formatPosition(int x, int y) {
    return "(" + convertToString(x + 1) + "," + convertToString(y + 1) + ")";
  }

  public void invert() {
    int tx = hx;
    hx = lx;
    lx = tx;
    
    int ty = hy;
    hy = ly;
    ly = ty;    
  }

  public boolean ishl() {    
    return hy == ly;
  }

  public int compareTo(Domino arg0) {
    if(this.high < arg0.high){
      return 1;
    }
    return this.low - arg0.low;
  }
  
}
