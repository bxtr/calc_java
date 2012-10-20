public class Calculator
{
  public static String calculate(String expression)
  {
    StringProcessing str = new StringProcessing(expression);
    if(!str.validateAndSplit())
      { return "Incorrect input"; }
    ComplexCalculation calc = new ComplexCalculation(str.getNumbers(), str.getSigns());
    return calc.calculate();
  }
}