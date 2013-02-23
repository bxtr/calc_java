public class Division extends Function
{
  public Division()
  {
    sign = "/";
    order = 2;
  }

  public double calculate(double nom, double ... divs)
  {
    double result = nom;
    for (double div: divs)
      result = result/div;
    return result;
  }
}