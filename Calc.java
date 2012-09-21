import java.util.regex.*;
import java.util.Scanner;

interface UserInterface
{
  public void display(String s);
  public String readLine();
}

interface Function
{
  public String calculate(String first, String second);
}

public class Calc
{
  public static String expression;
  public static String firstValue;
  public static String secondValue;
  public static String sign;

  public Calc(String s)
  {
    expression = s;
    if(!subtractor())
    {
      System.out.println("It doesn't seem like a correct input :(");
      System.exit(0);
    }
  }

  private static boolean subtractor()
  {
    Pattern p = Pattern.compile("[\\d]+[\\Q+-*/\\E][\\d]+");
    Matcher m = p.matcher(expression);
    if (m.matches())
      {
        Pattern p1 = Pattern.compile("[\\Q+-*/\\E]");
        Matcher m1 = p1.matcher(expression);
        if(m1.find()){
          int isign = m1.start();
          firstValue = expression.substring(0, isign);
          sign = expression.substring(isign, (isign+1));
          secondValue = expression.substring((isign+1), expression.length());
          return true;
        }
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
    userInterface.display("Input expression:");
    Calc calc = new Calc(userInterface.readLine());
    userInterface.display(firstValue + " " + sign + " " + secondValue + " = " + calc.calculate());
  }
  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////
  static class ConsoleInterface implements UserInterface
  {
    public void display(String s)
    { System.out.println(s);}
    
    public String readLine()
    { 
      String stringInput;
      Scanner scanIn = new Scanner(System.in);
      stringInput = scanIn.nextLine();
      scanIn.close();
      return stringInput;       
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
    { return (new Double(new Double(first).doubleValue() + new Double(second).intValue())).toString(); }
  }

  static class Multiplication implements Function
  {
    public String calculate(String first, String second)
    { return (new Double(new Double(first).doubleValue() * new Double(second).intValue())).toString(); }
  }


}

