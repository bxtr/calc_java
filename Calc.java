import java.util.regex.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface UserInterface
{
  public void display(String s);
  public String readExpession();
}

interface Function
{ public String calculate(String first, String second); }

public class Calc
{
  public static String expression;
  public static String firstValue;
  public static String secondValue;
  public static String sign;

  public Calc(String s)
  { expression = s;}

  private static boolean stringProcessing()
  {
    if(stringValidation(expression) && stringSeparator(expression))
      return true;
    else return false;
  }

  private static boolean stringValidation(String s)
  {
    Pattern p = Pattern.compile("[\\d]+[\\Q+-*/\\E][\\d]+");
    Matcher m = p.matcher(s);
    return m.matches();
  }
  private static boolean stringSeparator(String string)
  {
    Pattern p1 = Pattern.compile("[\\Q+-*/\\E]");
    Matcher m1 = p1.matcher(string);
    if(m1.find())
    {
      int isign = m1.start();
      firstValue = string.substring(0, isign);
      sign = string.substring(isign, (isign+1));
      secondValue = string.substring((isign+1), string.length());
      return true;
    }
    return false;
  }
  
  public String calculate()
  {
    Function func = chooseFunction();
    return (func.calculate(firstValue, secondValue));
  }

  private static Function chooseFunction()
  {
    Function func;
    if(sign.equals("+"))
      { func = new Addition();}
    else if (sign.equals("*")) 
      { func = new Multiplication(); }
    else if (sign.equals("-"))
      { func = new Subtraction(); }
    else if (sign.equals("/"))
      { func = new Division();}
    else
      { func = new NonExistingFunction();}
    return func;
  }

  public static void main(String[] args)
  {
    System.out.println("Choose interface:\n 1 for console; \n 2 for graphic.");
    int userPreference = StdIn.readInt();
    UserInterface userInterface;
    switch (userPreference)
    {
      case 1:
        userInterface = new ConsoleInterface();
        break;
  //    case 2:
  //      userInterface = GuiInterface();
  //      break;
      default:
        userInterface = new ConsoleInterface();
        break;
    }
    while(true)
    {
      userInterface.display("Input expression:");
      Calc calc = new Calc(userInterface.readExpession());
      if(calc.expression.equals(""))
        break;
      if(calc.stringProcessing())
        userInterface.display(calc.firstValue + " " + calc.sign + " " + calc.secondValue + " = " + calc.calculate());
      else
      { userInterface.display("It doesn't seem like a correct input :("); }
    }
  }
  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////
  static class ConsoleInterface implements UserInterface
  {
    public void display(String s)
    { System.out.println(s);}
    
    public String readExpession()
    { 
      String s = "";
      try {
          InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new BufferedReader(isr);
          s = br.readLine();
      } catch (IOException e) {
          e.printStackTrace();
      }
      return s;   
    }
  }
  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////
  static class NonExistingFunction implements Function
  {
    public String calculate(String first, String second)
    { return "Error: NonExistingFunction"; }
  }

  static class Addition implements Function
  {
    public String calculate(String first, String second)
    { return (new Double(new Double(first).doubleValue() + new Double(second).doubleValue())).toString(); }
  }

  static class Subtraction implements Function
  {
    public String calculate(String first, String second)
    { return (new Double(new Double(first).doubleValue() - new Double(second).doubleValue())).toString(); }
  }

  static class Multiplication implements Function
  {
    public String calculate(String first, String second)
    { return (new Double(new Double(first).doubleValue() * new Double(second).doubleValue())).toString(); }
  }

  static class Division implements Function
  {
    public String calculate(String first, String second)
    {
      double divider = new Double(second).doubleValue();
      if (divider != 0.0)
        return (new Double(new Double(first).doubleValue() / divider)).toString();
      else
        return "Cannot divide by zero";
    }
  }
}

