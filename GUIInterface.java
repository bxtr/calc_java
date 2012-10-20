public class GUIInterface implements UserInterface
{
  private GUIModel model;

  public GUIInterface()
  {
    model = new GUIModel();
    GUIController controller = new GUIController();
    GUIView view = new GUIView(controller);
    model.addObserver(view);
    controller.addModel(model);
  //  controller.addView(view);
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
  public void setAnswer(String answer)
  { model.setAnswer(answer);}

  public void displayError(String error)
  { model.setExpression(error);}
}