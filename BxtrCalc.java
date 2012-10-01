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
        userInterface = new ConsoleInterface();
        break;
      case 2:
        userInterface = new GuiInterface();
        break;
      default:
        userInterface = new ConsoleInterface();
        break;
    }
    /* Beginning work */
    Thread flowUserInterface = new Thread(userInterface);
    flowUserInterface.start();
    userInterface.startWork();
    while(true)
    {
      if(userInterface.response())
      {
      //  System.out.println("MAIN inside");
        StringProcessing strProc = new StringProcessing(userInterface.readExpession());
        if(strProc.expression.equals("exit"))
        {
          userInterface.endWork();
          break;
        }
        /* Returning processed variables */
        if(strProc.stringProcessing())
        {
          Calculation calc = new Calculation(strProc.getFirstValue(), strProc.getSecondValue(), strProc.getSign());
          System.out.println(calc.calculate());
          userInterface.displayAnswer(calc.calculate());
        }
        else
          { userInterface.displayErrorMessage("It doesn't seem like a correct input :("); }
        userInterface.preparationForNextResponse();
      }
      /* ???????????????????? */
      try{
          Thread.currentThread().sleep(100);
        }
        catch(InterruptedException ie){
        }
      /* ?????????????????????????? */
    }

  }
}