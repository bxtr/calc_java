public class Addition extends Function
{
  public Addition()
  {
    sign = "+";
    order = 3;
  }

  public double calculate(double first, double ... second)
  {
    double result = first;
    for (double element: second)
      result += element;
    return result;
  }
}