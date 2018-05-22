package edu.cnm.deepdive;

import java.util.Stack;

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
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      arg = arg.trim().toLowerCase();
/*      if (arg.equals("+")) {
        val1 = stack.pop();
        val2 = stack.pop();
        stack.push(val1 + val2);
      } else if (arg.equals("-")) {
        val1 = stack.pop();
        val2 = stack.pop();
        stack.push(val2 - val1);
      } else if (arg.equals("*")) {
        val1 = stack.pop();
        val2 = stack.pop();
        stack.push(val1 * val2);
      } else if (arg.equals("/")) {
        val1 = stack.pop();
        val2 = stack.pop();
        stack.push(val2 / val1);
      } else {
        double val = Double.parseDouble(arg);
        stack.push(val);
      }*/
      double val1;
      double val2;
      switch (arg) {
        case "add":
        case "+":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 + val2);
          break;
        case "sub":
        case "-":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val2 - val1);
          break;
        case "mul":
        case "*":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val1 * val2);
          break;
        case "div":
        case "/":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(val2 / val1);
          break;
        case "exp":
        case "^":
          val1 = stack.pop();
          val2 = stack.pop();
          stack.push(Math.pow(val2, val1));
          break;
        default:
          double val = Double.parseDouble(arg);
          stack.push(val);
      }

    }
    System.out.printf("Result = %,.2f", stack.pop());
  }

}
