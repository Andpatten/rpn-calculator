package edu.cnm.deepdive;

import java.util.Arrays;

/**
 * Enumerated values representing operators in a postfix (RPN) calculator. Each operator has a token
 * that is used to recognize the operator in an input string, and to represent the operator in an
 * output string.
 */
public enum Operator {
  /** Pops 2 values from stack, pushes sum of the 2 back onto stack. */
  ADD("+"),
  /** pops 2 values from stack, pushes differences of the 2 back onto stack. */
  SUBTRACT("-"),
  /** Pops 2 values from stack, pushes product of the two back onto stack. */
  MULTIPLY("*"),
  /** Pops 2 values from stack, pushes quotient of the two back onto stack. */
  DIVIDE("/"),
  /** Pops 1 value from the stack, pushes the square root of the two back onto stack. */
  SQUARE_ROOT("sqrt"),
  /** Pops 2 values from the stack, pushes the value of 1st raised to the 2nd back onto stack. */
  POWER("^"),
  /** Pops two values from stakc, pushes remainder after truncated division of the two back onto stack. */
  MODULO("%");

  private String token;

  Operator(String token) {
    this.token = token;
  }

  /**
   * Exercises the Operator enum by printing all of the enumerated values (as an array).
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(Operator.values()));
  }

  @Override
  public String toString() {
    return token;
  }

  //TODO Add operate method with switch (later version will use @override).
}
