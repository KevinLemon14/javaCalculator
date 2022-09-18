package uk.ac.rhul.cs2800;

/**
 * The enum for the symbols used in the calculator
 * 
 * @author Kevin
 *
 */
  public enum Symbol {
    LEFTBRACKET("("), 
    RIGHTBRACKET(")"), 
    MULTIPLY("*"), 
    DIVIDE("/"), 
    PLUS("+"), 
    MINUS("-"), 
    INVALID("Invalid Symbol");

    public String character;

    /**
     * Constructor for making a new Symbol enum.
     * 
     * @param symbol as a string
     */
    private Symbol(String symbol) {
      this.character = symbol;
    }


    /**
     * Finds the symbol of the enum.
     * 
     * @return the symbol used to represent the enum
     */
    public String toString() {
      return this.character;

    }
  }
  

