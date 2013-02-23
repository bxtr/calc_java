public class BxtrCalc
{
  public static void main(String[] args)
  {
    System.out.println("Choose interface:\n 1 for console; \n 2 for graphic.");
    int userPreference = StdIn.readInt();
    UserInterface userInterface;
    /* Switch user interface */
    switch (userPreference)
    {
      case 1:
        userInterface = new TUIInterface();
        break;
      case 2:
        userInterface = new GUIInterface();
        break;
      default:
        userInterface = new TUIInterface();
        break;
    }
    MachineForCalculation calc = new MachineForCalculation(new HolderFunction());
    /* Beginning work */
    while(true)
    {
      String expression = userInterface.getExpression();
      if(expression.equals("exit"))
        { break;}
      else
        { userInterface.setAnswer(calc.calculate(expression));}
    }
  }
}