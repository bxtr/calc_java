import java.util.regex.*;

interface UserInterface
{
  public void display(String s);
  public String read();
  public String toString();
  //  public void load();
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
      System.out.println("It does't seem like correct input :(");
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
  
  public void calculate()
  {
    chooseFunction();
  }

  private static void chooseFunction()
  {
    Function answer;
    if(sign.equals("+"))
      { answer = new Addition();}
    else if (sign.equals("*")) 
      { answer = new Multiplication(); }
    else
      { System.out.println("Non existing function"); return;}
    System.out.println(firstValue + " " + sign + " " + secondValue + " = " + answer.calculate(firstValue, secondValue));
  }

  public static void main(String[] args)
  {
    Calc calc = new Calc("167*10");
    calc.calculate();
  }

  ////////////////////////////////////////////////////
  ////////////////////////////////////////////////////

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

