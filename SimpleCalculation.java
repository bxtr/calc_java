public class SimpleCalculation
{
  /* Launching chosen fucntion and return answer */
  public static String calculate(String firstValue, String secondValue, String sign)
  {
    Function func = chooseFunction(sign);
    return (func.calculate(firstValue, secondValue));
  }

  /* Check available function and pick one of them.
  If sign doesn't match any available function - pick NonExitsingFucntion
  (return fixed error string)  */
  public static Function chooseFunction(String sign)
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

