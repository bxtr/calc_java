import java.util.regex.*;
import java.util.*;

public class StringProcessing
{
  private String expression;
  private List<String> numbers;
  private List<String> signs;
  private String regexValidation = "^((\\s*+\\d+(\\.\\d+|\\d*)\\s*)(\\s*(\\+|\\-|\\*|\\/)\\s*\\d+(\\.\\d+|\\d*)\\s*)++)$";
  private String regexNumbersSplit = "(^\\s*+(?=\\d*+))|(\\s*+[\\/\\*\\-\\+]\\s*+)";
  private String regexSignsSplit = "\\s*+\\d++(\\.\\d++|\\d*+)\\s*+";

  public StringProcessing(String stringInput)
  { expression = stringInput; }

  /* Complex validation and seperation process. Return true if success */
  public boolean validateAndSplit()
  {
    if(stringValidation(expression, regexValidation))
    {
      numbers = stringSplit(expression, regexNumbersSplit);
      signs = stringSplit(expression, regexSignsSplit);
      return true;
    }else{
      return false;
    }
  }

  /* Validation string. */
  public static boolean stringValidation(String s, String regex)
  {
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    return m.matches();
  }

  /* Separation string. */
  public static List<String> stringSplit(String s, String regex)
  {
    List<String> list = new ArrayList<String>();
    for (String split: s.split(regex))
    {
      if(!split.equals(""))
      { list.add(split);}
    }
    return list;
  }

  public List<String> getNumbers()
  { return numbers;}

  public List<String> getSigns()
  { return signs;}
}