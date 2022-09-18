package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

  ArrayList<Entry> stack = new ArrayList<Entry>(); // Creates an array list to be used as the stack

  /**
   * @return the number of elements in the stack
   */
  public int size() {
    return stack.size();
  }

  /**
   * Add a new value to the top of the stack.
   * 
   * @param i the value to be entered onto the stack
   * @return the value that has been entered onto the stack
   */
  public Entry push(Entry i) {
    stack.add(i);
    return i;
  }

  /**
   * Removes the top value of the stack
   * 
   * @return the top of the stack
   */
  public Entry pop() {
    if (stack.size() == 0) {
      throw new EmptyStackException();
    } else {
      Entry removedValue = stack.get(stack.size() - 1); // Stores value of item in stack about to be
      // popped so it can be returned once removed.
      stack.remove(stack.size() - 1);
      return removedValue;
    }
  }

  /**
   * This method returns the value of the element at the top of the stack
   * 
   * @return top of stack
   */
  public Entry top() {
    if (stack.size() == 0) {
      throw new EmptyStackException();
    } else {
      return stack.get(stack.size() - 1);
    }
  }

}
