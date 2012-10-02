public class GUIModel extends java.util.Observable { 
  
  private String expression = "";
  private String lastExpression; // or memory?
  private boolean inputDone = false;

  public void setExpression(String expression)
  { 
    this.expression = expression;
    setChanged();
    notifyObservers(expression);
  }

  public void addToExp(String expression)
  {
    this.expression += expression;
    setChanged();
    notifyObservers(expression);
  }

  public String getExpression()
  { return expression;}

  public void inputDone()
  { inputDone = true;}

  public boolean response()
  {return inputDone;}

  public void nextOperation()
  {
    setExpression("");
    inputDone = false;
  }
 
}