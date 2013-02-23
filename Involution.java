import java.lang.Math;

public class Involution extends Function
{
  public Involution()
  {
    sign = "^";
    order = 1;
  }

  public double calculate(double first, double ... second)
  {
    double result = first;
    for (double element: second)
      result = Math.pow(result, element);
    return result;
  }
}