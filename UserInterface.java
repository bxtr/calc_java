interface UserInterface extends Runnable
{
  /* Work starting - hello-message, adjustment and so on. But no initialization, of course. */
  public void startWork();
  /* Work ending - goodbye-message, killing windows and so on */
  public void endWork();
  public void displayAnswer(String s);
  public void displayErrorMessage(String s);
  public String readExpession();
  /* If expression is inserted return true else false */ 
  public boolean response();
  /* Preparation for next response */
  public void preparationForNextResponse();
}