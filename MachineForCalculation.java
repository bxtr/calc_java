public class MachineForCalculation
{
  private Calculator calc;
  private Parser parser;

  public MachineForCalculation(HolderFunction holder)
  {
    this.calc = new Calculator(holder.getAllFunction());
    this.parser = new Parser(holder.getAllPriority());
  }

  public String calculate(String str)
  { return calc.calculateRPN(parser.toRPN(str));}
}