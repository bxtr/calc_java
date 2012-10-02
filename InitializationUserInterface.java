/* Класс иницилизатор. Для удобного доступа к MVC */

public class UserInterface
{
  private UIController controller;
  private UIModel model;
  private UIView view;

  public UserInterface(int typeOfInterface)
  {
    model = new UIModel();
    switch (typeOfInterface)
    {
      /* TUI interface */
      case 1:
        controller = new TUIController();
        view = new TUIView();
        break;
      /* GUI interface */
      case 2:
        controller = new GUIController();
        view = new GUIView();
        break;
      /* TUI interface - default*/
      default:
        controller = new GUIController();
        view = new GUIView();
        break;
    }
  }

  public String getExpression()
  {
    return controller.getExpression();
  }

  public void setAnswer(String answer)
  {
    controller.setAnswer(answer);
  }

  public void displayError(int typeOfError)
  {
    // controller.displayError(typeOfError);
  }
}