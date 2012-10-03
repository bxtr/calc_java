public class GUIModel extends java.util.Observable { 
  
  private String expression = "";
  private String lastExpression; // or memory?
  private boolean inputDone = false;

  /*Set new expression and update view*/
  public void setExpression(String expression)
  { 
    this.expression = expression;
    setChanged();
    notifyObservers(expression);
  }
  /*Add new string to expression and update view*/
  public void addToExp(String expression)
  {
    this.expression += expression;
    setChanged();
    notifyObservers(expression);
  }

  public String getExpression()
  { return expression;}
  /*Set flag for response to true. */
  public void inputDone()
  { inputDone = true;}
  
  public boolean response()
  {return inputDone;}
  /*Preparation for new expression */
  public void nextOperation()
  {
    setExpression("");
    inputDone = false;
  }
 
}