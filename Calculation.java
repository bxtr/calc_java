public class Calculation
{
 // public static String expression;
  public static String firstValue;
  public static String secondValue;
  public static String sign;

  public Calculation(String firstValue, String secondValue, String sign)
  { 
    this.firstValue = firstValue;
    this.secondValue = secondValue;
    this.sign = sign;
  }
  
  /* Launching chosen fucntion and return answer */
  public String calculate()
  {
    Function func = chooseFunction();
    return (func.calculate(firstValue, secondValue));
  }

  /* Check available function and pick one of them.
  If sign doesn't match any available function - pick NonExitsingFucntion
  (return fixed error string)  */
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
}

