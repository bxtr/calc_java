import java.util.regex.*;

public class StringProcessing
{
  private String expression;
  private String firstValue;
  private String secondValue;
  private String sign;

  public StringProcessing(String stringInput)
  { expression = stringInput; }

  /* Complex validation and seperation process */
  public boolean stringProcessing()
  {
    if(stringValidation(expression) && stringSeparator(expression))
      return true;
    else return false;
  }

  /* Validation string. String shall have tow digit numbers, 
  separated one is four available since, without spases. */

  private boolean stringValidation(String s)
  {
    Pattern p = Pattern.compile("[\\d]+[\\Q+-*/\\E][\\d]+");
    Matcher m = p.matcher(s);
    return m.matches();
  }

  /* Separation string. String shall have tow digit numbers, 
  separated one is four available since, without spases. */

  private boolean stringSeparator(String string)
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

  public String getFirstValue()
  { return firstValue;}

  public String getSecondValue()
  { return secondValue;}

  public String getSign()
  { return sign;}

}