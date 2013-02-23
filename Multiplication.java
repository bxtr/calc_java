public class Multiplication extends Function
{
  public Multiplication()
  {
    sign = "*";
    order = 2;
  }

  public double calculate(double first, double ... second)
  {
    double result = first;
    for (double element: second)
      result = result * element;
    return result;
  }
}