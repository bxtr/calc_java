public abstract class Function
{
  protected String sign;
  protected int order;

  public String getSign()
  {return sign;}

  public int getOrder()
  {return order;}

  public abstract double calculate(double arg, double ... args);
}