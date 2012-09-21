interface UserInterface
{
  /* Initialization - hello-message, adjustment and so on */
  public void start();
  /* Work ending - goodbye-messgae, killing windows and so on */
  public void end();
  public void displayAnswer(String s);
  public void displayErrorMessage(String s);
  public String readExpession();
}