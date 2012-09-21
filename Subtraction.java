  public class Subtraction implements Function
  {
    public String calculate(String first, String second)
    { return (new Double(new Double(first).doubleValue() - new Double(second).doubleValue())).toString(); }
  }