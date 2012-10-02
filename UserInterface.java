public class UserInterface
{

//  private GUIController controller;
  private UIModel model;
 // private UIView view;

  public UserInterface()
  {
    model = new UIModel();
    GUIController controller = new GUIController();
    GUIView view = new GUIView(controller);
    model.addObserver(view);
    controller.addModel(model);
    controller.addView(view);
    view.addModel(model);
  }
  public String getExpression()
  {
    while(true)
    {
      if(model.response())
      {
        String s = model.getExpression();
        model.nextOperation();
        return s;
      }
      try{ Thread.currentThread().sleep(100);}
      catch(InterruptedException ie){}
    }
  }
/*
  public void setAnswer(String answer)
  {
    model.setAnswer(answer);
  }

  public void displayError(int typeOfError)
  {
    // controller.displayError(typeOfError);
  }
  */
/*
  public static void main(String args[])
  {



    model.addObserver(view);

    
    controller.addModel(model);
    controller.addView(view);
   // view.addController(controller);
    view.addModel(model);
  }
*/
}