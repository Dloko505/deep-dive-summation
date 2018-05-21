package edu.cnm.deepdive;

/**
 * This is the class containing the main entry point for the (eventual) RPN calculator.
 * 
 * @author De_El_ArE
 * @version 0.1
 */
public class Summation {

  /**
   * Command-line entry point for RPN interpreter.
   * 
   * @param args operands and operators.
   */
  public static void main(String[] args) {
    int sum = 0;
    // for (int i = 0; i < args.length; i++) {
    // int val = Integer.parseInt(args[i]);
    // sum += val;
    // }
    int i = 0;
    while (i < args.length) {
      args[i] = args[i].trim();
      int val = Integer.parseInt(args[i]);
      sum += val;
      i++;
    }
    System.out.println(sum);
  }

}
