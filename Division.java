public class Division implements Function
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