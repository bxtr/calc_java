public class GuiInterface implements UserInterface
{

  public void startWork()
  {
  }

  public boolean response()
  {
    return responseFlag;
  }

  public void preparationForNextResponse()
  {
    responseFlag = false;
  }
  public void endWork()
  { return;}

  public String readExpession()
  {
    return textField.getText();
  }

  public void displayAnswer(String s)
  {

    textField.setText(s);
  }

  public void displayErrorMessage(String s)
  {
    textField.setText(s);
  }

  public void run(){
    this.frame.setVisible(true);
  }

  public GuiInterface() {
    responseFlag = false;
    initialize();   
  }

}
