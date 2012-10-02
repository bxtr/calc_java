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
    /* Beginning work */
    while(true)
    {
      StringProcessing strProc = new StringProcessing(userInterface.getExpression());
      if(strProc.expression.equals("exit"))
      { break;}
      /* Returning processed variables */
      if(strProc.stringProcessing())
      {
        Calculation calc = new Calculation(strProc.getFirstValue(), strProc.getSecondValue(), strProc.getSign());
        userInterface.setAnswer(calc.calculate());
      }
      else
        { userInterface.displayError("It doesn't seem like a correct input :("); }
    }
  }
}