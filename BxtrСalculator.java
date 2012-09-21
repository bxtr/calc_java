public class BxtrСalculator
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
        userInterface = new ConsoleInterface();
        break;
  //    case 2:
  //      userInterface = new GuiInterface();
  //      break;
      default:
        userInterface = new ConsoleInterface();
        break;
    }
    /* Beginning work */
    userInterface.start();
    while(true)
    {
      Calculation calc = new Calculation(userInterface.readExpession());
      StringProcessing strProc = new StringProcessing(calc.expression);
      if(calc.expression.equals(""))
      {
        userInterface.end();
        break;
      }
      /* Returning processed variables */
      if(strProc.stringProcessing())
      {
        calc.firstValue = strProc.getFirstValue();
        calc.secondValue = strProc.getSecondValue();
        calc.sign = strProc.getSign();
        userInterface.displayAnswer(calc.calculate());
      }
      else
        { userInterface.displayErrorMessage("It doesn't seem like a correct input :("); }
    }

  }
}