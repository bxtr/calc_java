public class GUIModel extends java.util.Observable { 
  
  private String expression = "";
  private String lastExpression; // or memory?
  private String answer;
  private boolean inputDone = false;

  /*Set new expression and update view*/
  public void setExpression(String expression)
  { 
    this.expression = expression;
    setChanged();
    notifyObservers(expression);
  }
  public String getExpression()
  { return expression;}
  /*Add new string to expression and update view*/
  public void addToExp(String expression)
  {
    this.expression += expression;
    setChanged();
    notifyObservers(expression);
  }


  public void setAnswer(String answer)
  { 
    this.answer = answer;
    setChanged();
    notifyObservers(expression);
  }

  public String getAnswer()
  { return answer;}
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
    setChanged();
    notifyObservers(expression);
  }
 
  public void clearFields()
  {
    expression = new String();
    answer = new String();
    setChanged();
    notifyObservers(expression);
  }

  public void memory()
  {}

  public void shift()
  {
    expression = new String(answer);
    answer = new String();
    setChanged();
    notifyObservers(expression);
  }
}