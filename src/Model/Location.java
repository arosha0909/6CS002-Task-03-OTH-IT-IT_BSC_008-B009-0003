package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Location extends SpacePlace {
  public int c;
  public int r;
  public DIRECTION d;
  public enum DIRECTION {VERTICAL, HORIZONTAL};

  // Constructor for location without direction
  public Location(int r, int c) {
    this.r = r;
    this.c = c;
    this.d = null; // Explicitly setting direction to null
  }

  // Constructor for location with direction, using constructor chaining
  public Location(int r, int c, DIRECTION d) {    
    this(r, c); // Chaining to the base constructor
    this.d = d;
  }

  @Override
  public String toString() {
    int adjustedColumn = getAdjustedColumn();
    if(d == null){
      return "(" + adjustedColumn + "," + (r + 1) + ")";
    } else {
      return "(" + adjustedColumn + "," + (r + 1) + "," + d + ")";
    }
  }

  // Extracted method for adjusting column index
  private int getAdjustedColumn() {
    return c + 1;
  }
  
  public void drawGridLines(Graphics g) {
    g.setColor(Color.LIGHT_GRAY);
    for (int i = 0; i <= 7; i++) {
      g.drawLine(20, 20 + i * 20, 180, 20 + i * 20);
    }
    for (int i = 0; i <= 8; i++) {
      g.drawLine(20 + i * 20, 20, 20 + i * 20, 160);
    }
  }

  // Simplified getInt method with improved error handling
  public static int getInt() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      try {
        return Integer.parseInt(reader.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Invalid input, please enter a number.");
      } catch (Exception e) {
        System.out.println("An error occurred, please try again.");
      }
    }
  }
}
