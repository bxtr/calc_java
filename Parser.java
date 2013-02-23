import java.util.*;

public class Parser
{
  private Hashtable<String, Integer> priority;
  private String regexp;

  public Parser(Hashtable<String, Integer> priority)
  { 
    this.priority = priority;
    regexp = createRegexp();
  }

  private String createRegexp()
  {
    Enumeration<String> keys = priority.keys();
    StringBuffer str = new StringBuffer();
    str.append("[");
    while(keys.hasMoreElements())
    { str.append("\\" + "\\" + keys.nextElement());}
    str.append("]");
    return new String(str);
  }

  public Deque<String> splitExpression(String expression)
  {
    expression = expression.replace(" ", "");
    String regex = "(?<=op)|(?=op)".replace("op", regexp);
    Deque<String> exp = new LinkedList<String>(Arrays.asList(expression.split(regex)));
    //if expression starts with sign of operation, first element will be "".
    exp.remove("");
    return exp;
  }

  public Deque<String> toRPN(String expression)
  {
    Deque<String> exp = splitExpression(expression);
    Deque<String> sign = new LinkedList<String>();
    Deque<String> number = new LinkedList<String>();
    while(!exp.isEmpty())
    {
      String temp = exp.pop();
      if(temp.equals(("(")))
      { sign.addLast(temp);} 
      else if (temp.equals((")")))
        {
        String temp_lpr;
          while(true)
            { 
              temp_lpr = sign.pollLast();
              if(temp_lpr.equals("("))
                { break;}
              else
                {number.addLast(temp_lpr);}
            }
        } 
      else if(priority.containsKey(temp))
        {
          if(!sign.isEmpty())
          {
            {
              int priorityOfNewSign = priority.get(temp);
              while(!sign.isEmpty())
              {
                int priorityOfLastSign = priority.get(sign.peekLast());
                if(priorityOfLastSign<=priorityOfNewSign)
                  {number.addLast(sign.pollLast());}
                else
                  {break;}
              }
            }
          }
          sign.addLast(temp);      
        }
      else
        {number.addLast(temp);}
    }
    while(!sign.isEmpty())
    { number.addLast(sign.pollLast());}
    return number;
  }
}