import java.util.*;

public class HolderFunction
{
  private Hashtable<String, Function> functions;
  private Hashtable<String, Integer> priority;

  public HolderFunction()
  {
    Function add = new Addition();
    Function div = new Division();
    Function sub = new Subtraction();
    Function mul = new Multiplication();
    Function inv = new Involution();
    Function lpr = new LeftParenthesis();
    Function rpr = new RightParenthesis();
    Deque<Function> fun = new LinkedList<Function>(Arrays.asList(
      add, div, sub, mul, inv, lpr, rpr));

    this.functions = new Hashtable<String, Function>();
    this.priority = new Hashtable<String, Integer>();
    Iterator<Function> iter = fun.iterator();
    while(iter.hasNext())
    {
      Function temp = iter.next();
      priority.put(temp.getSign(), temp.getOrder());
      functions.put(temp.getSign(), temp);
    }
  //  priority.put("(", 10);
  }

  public Hashtable<String, Function> getAllFunction()
  { return functions;}

  public Hashtable<String, Integer> getAllPriority()
  { return priority;}
}