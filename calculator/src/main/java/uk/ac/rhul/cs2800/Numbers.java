package uk.ac.rhul.cs2800;

import java.util.ArrayList;

public class Numbers {
  ArrayList<String> list;

  /**
   * Creates a new ArrayList called list.
   */
  public Numbers() {
    list = new ArrayList<String>();
  }

  /**
   * @param line
   */
  public void add(String line) {
    list.add(line);
    
  }

  @Override
  public String toString() {
    return "Numbers [list=" + list + "]";
  }

}
